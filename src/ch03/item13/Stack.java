package ch03.item13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public Stack() {
    this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  @Override
  public Stack clone(){
    try{
      Stack result = (Stack) super.clone();
      result.elements = elements.clone();
      return result;
    } catch(CloneNotSupportedException e){
      throw new AssertionError();
    }
  }

  public void push(Object o){
    ensureCapacity();
    elements[size++] = o;
  }

  public Object pop(){
    if (size == 0)
      throw new EmptyStackException();
    Object result = elements[--size];
    elements[size] = null;//  다 쓴 참조 해제
    return result;
  }
  private void ensureCapacity(){
    if (elements.length == size)
      elements = Arrays.copyOf(elements, 2 * size +1);
  }
}
