package ch04;

public class Super {
  // 잘못된 예: 생성자가 재정의하는 메서드를 호출
  public Super(){
    overrideMe();
  }

  public void overrideMe(){}

}
