package ch03.item13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 10-1 잘못된 코드- 대칭성 위배
public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{

  private final String s;

  public CaseInsensitiveString(String s) {
    this.s = Objects.requireNonNull(s);
  }

  public int compareTo(CaseInsensitiveString cis){
    return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
  }

  public static void main(String[] args){
    CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
    String s = "polish";
    System.out.println(s.equals(cis)); // false

    List<CaseInsensitiveString> list = new ArrayList<>();
    list.add(cis);
    System.out.println(list.contains(s)); // false
  }

}
