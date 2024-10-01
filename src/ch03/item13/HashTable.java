package ch03.item13;

public class HashTable implements Cloneable{
  private Entry[] buckets ;

  private static class Entry{
    final Object key;
    Object value;
    Entry next;

    Entry(Object key, Object value, Entry next){
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }

  //clone 재귀적으로 호출해보기
  @Override
  public HashTable clone(){
    try{
      HashTable result = (HashTable) super.clone();
      result.buckets = buckets.clone();
      return result;
    } catch (CloneNotSupportedException e){
      throw new AssertionError();
    }
  }
}
