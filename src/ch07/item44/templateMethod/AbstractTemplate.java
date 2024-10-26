package ch07.item44.templateMethod;

public abstract class AbstractTemplate {
  // 템플릿 메서드: 메서드 앞에 final 키워드를 붙이면 자식 클래스에서 오버라이딩이 불가능함
  // final 선언: 자식 클래스에서 상위 탬플릿을 오버라이딩하여 바꾸는 행위 봉쇄
  public final void templateMethod(){
    step1();
    step2();

    if(hook()){
      // 안의 로직을 실행하거나 실행하지 않음
    }
    step3();
  }

  boolean hook(){
    return true;
  }

  // 상속해서 구현할 내용 (protected 접근 제어자 설정)
  protected abstract void step1();
  protected abstract void step2();
  protected abstract void step3();
}
