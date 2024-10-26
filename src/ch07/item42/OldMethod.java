package ch07.item42;

import static java.util.Comparator.comparingInt;

import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OldMethod {
  public void oldSort(List<String> words){
//    Collections.sort(words, comparingInt(String::length));
//    words.sort(comparingInt(String::length));

    Collections.sort(words, new Comparator<String> (){
      public int compare(String s1, String s2){
        return Integer.compare(s1.length(), s2.length());
      }
    });
    Instant now = Instant.now();

  }
}
