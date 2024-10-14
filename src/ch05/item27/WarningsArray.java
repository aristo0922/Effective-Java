package ch05.item27;

import java.util.Arrays;

public class WarningsArray {

  static int size = 5;
  static String[] elements = {"123", "asdf", "qwer", "XH"};

  public <T> T[] toArray(T[] a) {
    if (a.length < size) {
      // 생성한 배열과 매개변수로 받은 배열의 타입이 모두 T[]로 같으므로
      // 올바른 형변환이다.
      @SuppressWarnings("uncheked")
      T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
      return result;
    }
    System.arraycopy(elements, 0, a, 0, size);
    if (a.length > size) {
      a[size] = null;
    }
    return a;
  }

  public static void main(String[] args) {
    WarningsArray warningsArray = new WarningsArray();
    String[] a = new String[size - 2];
    warningsArray.toArray(a);
  }

}
