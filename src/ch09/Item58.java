package ch09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.text.Element;

public class Item58 {

  enum Suit {CLUB, DIAMOND, HEART, SPADE}

  enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

  public void code(List<Element> c, int[] a) {
    for (Iterator<Element> i = c.iterator(); i.hasNext(); ) {
      Element e = i.next();
      // e 로 무언가를 한다.
    }

    for (int i = 0; i < a.length; i++) {
      // a[i] 로 무언가를 한다.
    }
  }

  class Card{
    Suit suit;
    Rank rank;
    Card(Suit suit, Rank rank){

    }
  }
  public void goodCode(List<Element> elements, List<Suit> suits, List<Rank> ranks) {
    List<Card> deck = new ArrayList<>();
    for (Element e : elements) {
      // e로 무언가를한다.
    }

    for(Suit suit: suits)
      for(Rank rank: ranks)
        deck.add(new Card(suit, rank));
  }

}
