package ch05.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {

  private Map<Class<?>, Object> favorites = new HashMap<>();

  public <T> void putFavorites(Class<T> type, T instnace) {
    favorites.put(Objects.requireNonNull(type), instnace);
  }

  ;

  public <T> T getFavorites(Class<T> type) {
    return type.cast(favorites.get(type));
  }

  public static void main(String[] args) {
    Favorites f = new Favorites();

    f.putFavorites(String.class, "Java");
    f.putFavorites(Integer.class, 0xcafebabe);
    f.putFavorites(Class.class, Favorites.class);

    String favoriteString = f.getFavorites(String.class);
    int favoriteInteger = f.getFavorites(Integer.class);
    Class<?> favoriteClass = f.getFavorites(Class.class);
  }
}
