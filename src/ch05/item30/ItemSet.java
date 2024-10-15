package ch05.item30;

import java.util.HashSet;
import java.util.Set;

public class ItemSet {
//  public static Set union(Set s1, Set s2){
//    Set result = new HashSet(s1);
//    result.addAll(s2);
//    return result;
//  }
  public static <E> Set<E> union(Set<E> s1, Set<E> s2){
    Set<E> result = new HashSet(s1);
    result.addAll(s2);
    return result;
  }

  public static void main(String[] args) {
    Set<String> guys = Set.of("Harry", "Rone", "Dick");
    Set<String> stooges = Set.of("Moae", "Kerry", "Larry");
    Set<String> aflCio = union(guys, stooges);
    System.out.println(aflCio);
  }
}
