package ch07.item44.templateMethod;

public class Client {

  public static void main(String[] args) {
    AbstractTemplate templateA = new ImplementationA();
    templateA.templateMethod();
  }
}
