package ch10;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class Item73<E> {

  ListIterator<E> listIterator(int index) {
    return null;
  }

  public E get(int index) {
    ListIterator<E> i = listIterator(index);

    try {
      return i.next();
//    } catch (LowerLevelException cause){
//      throw new HigherLevelException(cause);
    } catch (NoSuchElementException e) {
      throw new IndexOutOfBoundsException("인덱스: " + index);
    }
  }

}
