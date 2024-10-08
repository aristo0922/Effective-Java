package ch04;

import java.time.Instant;

public final class Sub extends Super{

  // 생성자에서 초기화
  private final Instant instant;

  Sub(){
    instant = Instant.now();
  }

  //재정의 가능 메서드, 상위 클래스 생성자가 호출함
  @Override
  public void overrideMe(){
    System.out.println(instant);
  }

  public static void main(String[] args){
    Sub sub = new Sub();
    sub.overrideMe();
  }

}
