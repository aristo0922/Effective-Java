package ch05.item26;

import java.util.Set;

public class numElementsInCommon {
  static int numElementsInCommmon(Set<?> s1, Set<?> s2){
    int result = 0;
    for (Object o1 : s1)
      if(s2.contains(o1))
        result++;
    return result;
  }

}
