package ch05.item28;

import java.util.ArrayList;
import java.util.List;

public class FailRuntime {

  public static void main(String[] args) {
    Object[] objectArray = new Long[1];
    // 런타임 실패 코드
    objectArray[0] = "타입이 달라 넣을 수 없다.";// ArrayStoreException 발생

    // 컴파일 실패 코드
//    List<Object> objectList = new ArrayList<Long>();
//    objectList.add("타입이 달라 넣을 수 없다.");
  }


}
