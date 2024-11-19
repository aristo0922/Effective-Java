package ch08;

import ch07.item47.ProcessHandle;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.swing.text.html.Option;

public class Item55 {
  public static <E extends Comparable<E>> Optional<E> max(Collection<E> c){
    if (c.isEmpty()) return Optional.empty();

    E result = null;
    for (E e: c)
      if (result == null || e.compareTo(result) > 0)
        result = Objects.requireNonNull(e);
    return Optional.of(result);
  }

  public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c){
    return c.stream().max(Comparator.naturalOrder());
  }

  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    // 1.
    String lastWordInLexicon = max2(words).orElse("단어 없음...");

    // 2.
    String wordInLexicon = max2(words).orElseThrow(NullPointerException::new);

    // 3. 항상 값이 채워져 있다고 가정한다.
    String lastNobleTitle = max(words).get();

    ProcessHandle ph = new ProcessHandle();
    Optional<ProcessHandle> parentProcess = ph.parent();
    System.out.println("부모 PID : "+(parentProcess.isPresent() ? String.valueOf(parentProcess.get().pid()) : "N/A"));

    System.out.println("부모 PID: "+ ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));

    Stream<Optional<Cheese>> streamOfOptionals = Cheese.getCheeses()
        .stream() // Optional을 Stream으로 변환
        .flatMap(List::stream) // List<Cheese>를 펼침
        .map(Optional::of);    // 각 Cheese를 Optional로 래핑
    streamOfOptionals.flatMap(Optional::stream);
  }


}
