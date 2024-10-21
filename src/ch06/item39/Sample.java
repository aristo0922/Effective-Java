package ch06.item39;

public class Sample {
  @Test
  public static void m1(){} // 예외 x

  public static void m2(){} // Test 도구가 무시

  @Test
  public static void m3(){
    throw new RuntimeException("FAIL"); // 예외 O
  }

  public static void m4(){}// Test 도구가 무시

  @Test
  public void m5(){ } // 예외 x, 잘못 사용한 예(정적x)

  public static void m6(){ } // Test 도구가 무시

  @Test
  public static void m7(){
    throw new RuntimeException("FAIL"); // 예외 O
  }

  public static void m8(){ } // Test 도구가 무시

}
