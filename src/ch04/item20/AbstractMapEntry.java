package ch04.item20;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public abstract class AbstractMapEntry <K, V> implements Map.Entry<K, V>{
  // 변경 가능한 엔트리는 이 메서드를 반드시 재정의한다.
  @Override
  public V setValue(V value){
    throw new UnsupportedOperationException();
  }

  //Map.Entry.equals 의 일반 규약 구현
  @Override
  public boolean equals(Object o){
    if (o == this){
      return true;
    }
    if (!(o instanceof Map.Entry))
      return false;
    Map.Entry<?,?> e = (Map.Entry) o;
    return Objects.equals(e.getKey(), getKey())
        && Objects.equals(e.getValue(), getValue());
  }

  // Map.Entry.hashCode의 일반 규약 구현
  @Override
  public int hashCode(){
    return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
  }

  @Override
  public String toString(){
    return getKey() + "=" +getValue();
  }
}
