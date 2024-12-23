package ch07.item52;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {

  public static String classify(Collection<?> c) {
    return c instanceof Set ? "집합":
        c instanceof List ? "리스트": "그 외";
  }

  public static void main(String[] args) {
    Collection<?>[] collections = {
        new HashSet<String>(),
        new ArrayList<BigInteger>(),
        new HashMap<String, String>().values()
    };

    for (Collection<?> c : collections) {
      System.out.println(classify(c));
    }
  }

}
