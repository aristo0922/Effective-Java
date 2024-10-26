package ch07.item44.strategy;

public class Client {

  public static void main(String[] args) {
    Context c = new Context();

    c.setStrategy(new ConcreteStrateA());
    c.doSomething();
    c.setStrategy(new ConcreteStrategyB());
    c.doSomething();
  }

}
