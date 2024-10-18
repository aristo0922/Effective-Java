package ch06.transientTest;

import java.io.Serializable;

public class Member implements Serializable {

  private String name;
  private transient String email;
  private transient int age;

  public Member(String name, String email, int age){
    this.name= name;
    this.email = email;
    this.age = age;
  }

  @Override
  public String toString(){
    return String.format("Member{name='%s', email='%s', age='%s'}", name, email, age);
  }
}
