package ch03.item10.transivity;

public class MyType {
  MyType(){

  }

  @Override
  public boolean equals(Object o){
    if(!(o instanceof MyType))
      return false;
    MyType mt = (MyType) o;
    // ...
    return true;
  }


}
