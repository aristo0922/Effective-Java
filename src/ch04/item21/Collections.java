//package ch04.item21;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Objects;
//
//public interface Collections {
//  default boolean removeIf(Predicate<? super E> filter){
//    Objects.requireNonNull(filter);
//    boolean result = false;
//    for(Iterator<E> it = iterator(); it.hasNext();){
//      if(filter.test(it.next())){
//        it.remove();
//        result = true;
//      }
//    }
//
//    return result;
//  }
//
//}
