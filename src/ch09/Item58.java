package ch09;

import java.util.Iterator;
import java.util.List;
import javax.swing.text.Element;

public class Item58 {
  public void code(List<Element> c, int[] a){
    for(Iterator<Element> i = c.iterator(); i.hasNext();){
      Element e= i.next();
      // e 로 무언가를 한다.
    }

    for(int i = 0; i < a.length; i++){
      // a[i] 로 무언가를 한다.
    }
  }

}
