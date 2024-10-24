package ch06.item39;

import java.util.ArrayList;
import java.util.List;

public class Sample4 {
  @ExceptionTest4(IndexOutOfBoundsException.class)
  @ExceptionTest4(NullPointerException.class)
  public static void doublyBad(){ // 성공해야 하는 메서드
    List<String> list = new ArrayList<>();
    list.addAll(5, null);
  }
}