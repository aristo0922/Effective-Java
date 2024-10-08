package ch04.item24;

import java.util.AbstractSet;
import java.util.Iterator;

public class MySet<E> extends AbstractSet<E> {
  @Override
  public Iterator<E> iterator(){
    return new MyIterator();
  }

  private class MyIterator implements Iterator<E>{
    MyIterator(){

    }

    @Override
    public boolean hasNext() {
      return false;
    }

    @Override
    public E next() {
      return null;
    }
  }



}
