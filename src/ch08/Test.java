package ch08;

import java.util.EnumSet;

public class Test {

  private <E extends Enum<E>> EnumSet<E> s(E e1) {
    return null;
  }
}
