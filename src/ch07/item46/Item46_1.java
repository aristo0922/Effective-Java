package ch07.item46;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Item46_1 {

  public static void main(String[] args) {
    Map<String, Long> freq = new HashMap<>();
    try (Stream<String> words = new Scanner(file).tokens()){
      freq = words.collect(groupingBy(String::toLowerCase, counting()));
    }
  }

}
