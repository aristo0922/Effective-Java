package ch07.item46;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Item46_1 {

  public static void main(String[] args) {
    Map<String, Long> freq = new HashMap<>();
    try (Stream<String> words = new Scanner(file).tokens()){
      words.forEach(word -> {
        freq.merge(word.toLowerCase(), 1L, Long::sum);
      });
    }
  }

}
