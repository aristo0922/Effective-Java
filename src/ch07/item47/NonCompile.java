package ch07.item47;

import java.util.stream.Stream;

public class NonCompile {

  static class ProcessHandle extends Object{
    private static Stream member;
    public static Stream allProcesses(){
      return member;
    }
  }

  public static <E> Iterable<E> iterableOf(Stream<E> stream){
    return stream::iterator;
  }

  public static void main(String[] args) {
//    for(ProcessHandle ph: iterableOf(ProcessHandle.allProcesses())){
//    }
  }
}
