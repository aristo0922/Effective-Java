package ch09;

import java.util.Comparator;

public class Item61_2 {

  public static void main(String[] args) {
    Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
      int i = iBoxed, j = jBoxed;
      return i < j? -1:(i == j ? 0 : 1);
    };

    int result = naturalOrder.compare(new Integer(42), new Integer(42));
    System.out.println(result);
  }

}
