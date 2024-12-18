package ch03.item10.tests;

import ch03.item10.CaseInsensitiveString;
import java.util.ArrayList;
import java.util.List;

public class Test {
//  static List<CaseInsensitiveString> list = new ArrayList<>();
  static List<String> list = new ArrayList<>();

  public static void main(String[] args) {
//    SClass s = new SClass();
//    if (list.contains(s)){
//      System.out.println("execute SClass equals = ");
//    }
//    System.out.println("execute collectionEquals");
    list.add("LIsst");
    System.out.println(list.indexOf("list"));
    System.out.println(list.indexOf("LIsst"));

  }

  static class SClass extends Object{
    String s = "polish";

    @Override
    public boolean equals(Object o){
      System.out.println("parameter equals");
      return true;
    }

  }
}
