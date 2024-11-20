package ch08;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cheese {

  private static final List<Cheese> cheesesInStock = new ArrayList<>();

  public static Optional<Cheese> getCheese() {
    if (cheesesInStock.isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(new Cheese());
  }

//  public static Stream<Optional<Cheese>> getCheese() {
//    // Convert the list of cheeses into a Stream of Optional<Cheese>
//    return cheesesInStock.stream()
//        .map(Optional::of); // Wrap each Cheese in Optional
//  }
}
