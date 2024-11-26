package ch09;

import java.util.Arrays;
import java.util.Iterator;
import javax.lang.model.element.Element;

public class Item57 {

  public void code1(Element[] c) {
    for (Element e : c) {
      // e 로 무언가를 한다.
    }

    for (Iterator<Element> i = Arrays.stream(c).iterator(); i.hasNext(); ) {
      Element e = i.next();
    }

    for (int i =0, n = expensiveComputation(); i<n; i++){
      // i 로 무언가를 한다.
    }
  }

  public static int expensiveComputation(){
    return 0;
  }

}
