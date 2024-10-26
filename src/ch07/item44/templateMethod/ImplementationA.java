package ch07.item44.templateMethod;

public class ImplementationA extends AbstractTemplate{

  private String name = "ImplementationA";

  @Override
  protected void step1() {
    System.out.println("stap1 name = " + name);
  }

  @Override
  protected void step2() {
    System.out.println("stap2 name = " + name);
  }

  @Override
  protected void step3() {
    System.out.println("stap3 name = " + name);
  }
}
