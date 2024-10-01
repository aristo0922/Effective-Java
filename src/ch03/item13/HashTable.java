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

//    // 이 엔트리가 가리키는 연결리스트를 반복적으 복사
//    Entry deepCopy(){
//      Entry result = new Entry(key, value, next);
//      for (Entry p = result; p.next != null; p = p.next)
//        p.next = new Entry(p.next.key, p.next.value, p.next.next);
//      return result;
//    }
  }

  @Override
  public final Object clone() throws CloneNotSupportedException{
    throw new CloneNotSupportedException();
  }
}
