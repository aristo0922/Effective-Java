package ch07.item46;

import static java.time.chrono.JapaneseEra.values;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

import ch06.item38.Operation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Item46_1 {
  private static final Map<String, Object> stringToEnum = Stream.of(values())
      .collect(toMap(Object::toString, e -> e));

  public static void main(String[] args) {
    Map<String, Long> freq = new HashMap<>();
//    try (Stream<String> words = new Scanner(file).tokens()){
//      freq = words.collect(groupingBy(String::toLowerCase, counting()));
//    }

    List<String> topTen = freq.keySet().stream()
        .sorted(comparing(freq::get).reversed())
        .limit(10)
        .collect(toList());

  }

}
