package ch07.item44;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest<K, V> extends LinkedHashMap<K, V> {

  @Override
  protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
    return size() > 100;
  }

  @FunctionalInterface
  interface EldestEntryRemovalFunction<K, V>{
    boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);
  }

}
