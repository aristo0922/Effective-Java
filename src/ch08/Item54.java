package ch08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Item54 {
  private final List<Cheese> cheesesInStock = new ArrayList<>();

  public List<Cheese> getCheese(){
    return new ArrayList<>(cheesesInStock);
  }

  public List<Cheese> getCheeses(){
    return cheesesInStock.isEmpty()? Collections.emptyList() : new ArrayList<>(cheesesInStock);
  }

  private static final Cheese[] EMPTYCHEESE_ARRAY = new Cheese[0];
  public Cheese[] getCheeses2(){
    return cheesesInStock.toArray(EMPTYCHEESE_ARRAY);
  }
}
