package ch07.item45;

import static java.util.stream.Collectors.groupingBy;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Anagrams {

  public static void main(String[] args) {
    Path dictionary = Paths.get(args[0]);
    int minGroupSize = Integer.parseInt(args[1]);

    Map<String, Set<String>> groups = new HashMap<>();
    try(Stream<String> words = Files.lines(dictionary)){
      words.collect(groupingBy(word -> alphabetize(word)))
          .values().stream()
          .filter(group -> group.size() >= minGroupSize)
          .forEach(g -> System.out.println(g.size() + ": " + g));
    }catch (Exception e){
      e.printStackTrace();
    }

    for(Set<String>group: groups.values()){
      if (group.size() >= minGroupSize) {
        System.out.println(group +" : " + group.size());
      }
    }
  }

  private static String alphabetize(String s){
    char[] a = s.toCharArray();
    Arrays.sort(a);
    return new String(a);
  }

}
