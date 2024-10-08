package ch04;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InstrumentedHashSet <E> extends HashSet<E> {
  // 추가된 원소의 수
  private int addCount = 0;

  public InstrumentedHashSet(){

  }

  public InstrumentedHashSet(int initCap, float loadFactor){
    super(initCap, loadFactor);
  }

  @Override
  public boolean add(E e){
    addCount++;
    return super.add(e);
  }

  @Override
  public boolean addAll(Collection<? extends E> c){
    addCount += c.size();
    return super.addAll(c);
  }

  public int getAddCount(){
    return addCount;
  }

  public static void main(String[] arg)throws IOException{
    InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
    s.addAll(List.of("틱", "틱틱", "펑"));
    System.out.println(s.getAddCount());
  }

}
