package ch07.item44.templateMethod;

public class ImplementationB extends AbstractTemplate{

  @Override
  protected void step1() {

  }

  @Override
  protected void step2() {

  }

  @Override
  protected void step3() {

  }

  // template 의 마지막 로직이 실행되지 않도록 설정
  @Override
  protected boolean hook(){
    return false;
  }
}
