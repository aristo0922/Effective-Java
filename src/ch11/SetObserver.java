package ch11;

@FunctionalInterface
public interface SetObserver<E> {
  public void added(ObservableSet<E> es, E element) ;
}
