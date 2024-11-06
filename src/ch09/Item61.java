package ch09;

import java.util.Comparator;

public class Item61 {

  public static void main(String[] args) {
    Comparator<Integer> naturalOrder = (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

    int result = naturalOrder.compare(new Integer(42), new Integer(42));
    System.out.println("Integer 42 :"+result);
    result = naturalOrder.compare(42, 42);
    System.out.println("int 42 : "+result);
  }

}
