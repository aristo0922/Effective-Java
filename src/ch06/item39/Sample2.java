package ch06.item39;

public class Sample2 {
  @ExceptionTest(ArithmeticException.class)
  public static void m1(){ // success
    int i =0;
    i = i / i;
  }

  @ExceptionTest(ArithmeticException.class)
  public static void m2(){ // fail, other exception
    int[] a = new int[0];
    int i = a[1];
  }

  @ExceptionTest(ArithmeticException.class)
  public static void m3(){} /// fail, not exception
}
