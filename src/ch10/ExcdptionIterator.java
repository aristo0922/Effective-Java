package ch10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcdptionIterator {

  class Foo{

  }
  public static void main(String[] args) {
    List collection = new ArrayList<>();
    for (Iterator<Foo> i = collection.iterator(); i.hasNext();){
      Foo foo = i.next();
      // r...
    }
  }

}
