package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObservableSet<E> extends ForwardingSet<E> {
  public ObservableSet(Set<E> set) {super(set);}
  private final List<SetObserver<E>> observers = new ArrayList<>();

  public void addObserver(SetObserver<E> observer){
    synchronized(observers){
      observers.add(observer);
    }
  }

  public boolean removeObserver(SetObserver<E> observer){
    synchronized (observers){
      return observers.remove(observer);
    }
  }

  private void notifyElementAdded(E element){
    List<SetObserver<E>> snapshot = null;
     synchronized (observers){
       snapshot = new ArrayList<>(observers);
     }
    for(SetObserver<E> observer: observers)
        observer.added(this, element);
  }

  @Override public boolean add(E element){
    boolean added = super.add(element);
    if (added)
      notifyElementAdded(element);
    return added;
  }

  @Override public boolean addAll(Collection<? extends E> c){
    boolean result = false;
    for (E element: c)
      result |= add(element);
    return result;
  }

  public static void main(String[] args){
    ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
    set.addObserver(new SetObserver<>() {
      public void added(ObservableSet<Integer> s, Integer e){
        System.out.println(e);
        if (e == 23){
          ExecutorService exec = Executors.newSingleThreadExecutor();
          try {
            exec.submit(() -> s.removeObserver(this)).get();
          }catch (ExecutionException | InterruptedException ex){
            throw new AssertionError(ex);
          } finally {
            exec.shutdown();
          }
        }
      }
    });
  }
}
