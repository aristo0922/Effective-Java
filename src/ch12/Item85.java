package ch12;

import java.io.InvalidObjectException;
import java.util.HashSet;
import java.util.Set;

public class Item85 {

  static byte[] bomb() {
    Set<Object> root = new HashSet<>();
    Set<Object> s1 = root;
    Set<Object> s2 = new HashSet<>();

    for (int i = 0; i < 100; i++) {
      Set<Object> t1 = new HashSet<>();
      Set<Object> t2 = new HashSet<>();
      t1.add("foo");
      s1.add(t2);

      s2.add(t1); s2.add(t2);
      s1 = t1;
      s2 = t2;
    }
    return serialize(root);
  }

  private static byte[] serialize(Set<Object> root) {
    return new byte[0];
  }

  private void readObjectNoData() throws InvalidObjectException{
    throw new InvalidObjectException("스트림 데이터가 필요합니다.");
  }

}
