package ch07.item46;

import java.util.Map;

public class item46_5 {
  static class Artist{}
  static class Album{
    Album(){}
  }
  public static void main(String[] args) {
    Album albums = new Album();

//    Map<Artist, Album> topHIts = albums.collect(
//        toMap(Album::artist, a -> a, maxBy(comparing(Album::sales)))
//    );

  }

}
