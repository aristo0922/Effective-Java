package ch07.item42.Anonymous;

public class AnonymousClass {

  public static void main(String[] args) {
    // 익명 클래스 클래스 정의와 객체화를 동시에. 일회성
    Animal dog = new Animal(){
      @Override
      public String bark(){
        return " 개 짖는 소리 안나게 해라 !";
      }
    };

    System.out.println(dog.bark());
  }

}
