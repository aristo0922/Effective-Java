package ch07.item47;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ProcessHandle  {
  public static <E> Stream<E> streamOf(Iterable<E> iterable){
    return StreamSupport.stream(iterable.spliterator(), false);
  }

  public Optional<ProcessHandle> parent() {
    return Optional.empty();
  }

  public char[] pid() {
    return new char[0];
  }
}
