package ch04.item20;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class intArrayAsList {
  static List<Integer> integerList(int [] a){
    Objects.requireNonNull(a);

    // 다이아몬드 연산자 Java ver.9 ~
    return new AbstractList<>() {
      @Override
      public Integer get(int i){
        return a[i];
      }

      @Override
      public Integer set(int i, Integer val){
        int oldVal = a[i] ;
        a[i] = val; //오토언박싱
        return oldVal;//오토박싱
      }

      @Override
      public int size(){
        return a.length;
      }
    };
  }
}
