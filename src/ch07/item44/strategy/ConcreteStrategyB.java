package ch07.item44.strategy;

public class ConcreteStrategyB implements IStrategy{

  @Override
  public void doSomething() {
    System.out.println("this.toString() = " + this.toString());
  }
}
