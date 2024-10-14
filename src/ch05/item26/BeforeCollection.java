package ch05.item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BeforeCollection {
//  private final Collection stamps ;
  private static final List<Stamp> stamps = new ArrayList();
  private static class Coin{
    int size = 0;
  }

  private static class Stamp{
    public void cancel(){

    };
  }

  public static void main(String[] args){
    stamps.add(new Coin()); // 컴파일 오류
    for(Iterator i =stamps.iterator(); i.hasNext();){
      Stamp stamp = (Stamp) i.next();
      stamp.cancel();
    }
  }
}
