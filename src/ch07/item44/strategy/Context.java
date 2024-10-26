package ch07.item44.strategy;

public class Context {
  IStrategy strategy;

  void setStrategy(IStrategy strategy){
    this.strategy = strategy;
  }

  void doSomething(){
    this.strategy.doSomething();
  }

}
