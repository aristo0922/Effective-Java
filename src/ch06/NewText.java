package ch06;

import java.util.EnumSet;
import java.util.Set;

public class NewText {

  public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

  // 어떤 Set 을 넘겨도 좋으나 EnumSet 이 가장 좋다.
  public void applyStyles(Set<Style> styles) {

  }
  public static void main(String[] args) {
    NewText text = new NewText();
    text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));

  }

}
