package ch09;

public final class ThreadLocal {
  public ThreadLocal(){
  }


  // 현 스레드의 값을 키로 구분해 저장
  public static void set(Object value) {

  }

  // 키가 가리키는 현 스레드의 값을 반환
  public static Object get() {
    return new ThreadLocal();
  }

}
