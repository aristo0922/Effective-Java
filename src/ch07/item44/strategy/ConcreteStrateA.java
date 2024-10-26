package ch07.item44.strategy;

public class ConcreteStrateA implements IStrategy{

  @Override
  public void doSomething() {
    System.out.println("this.toString() = " + this.toString());
  }
}
