package ch09;

public class ThreadLocal {
  private ThreadLocal(){
    // ㄱㅐㄱ체 생성 불가
  }
  private static class Key{
    Key(){ }
  }

  // 현 스레드의 값을 키로 구분해 저장
  public static void set(Key key, Object value) {

  }

  // 키가 가리키는 현 스레드의 값을 반환
  public static Object get(String key) {
    return new Key();
  }

}
