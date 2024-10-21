package ch06.item38;

public class RunTest {

  public static void main(String[] args) {
    double x = Double.parseDouble("10");
    double y = Double.parseDouble("2");
    test(ExtendedOperation.class, x, y);
  }

  private static <T extends Enum<T> & Operation> void test(
      Class<T> opEnumType, double x, double y){
    for(Operation op : opEnumType.getEnumConstants()){
      System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
  }

}
