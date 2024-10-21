package ch06.item37;

import static java.util.stream.Collectors.groupingBy;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Phase {
  SOLID, LIQUID, GAS;

  public enum Transition {
    MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
    BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
    SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

    private final Phase from;
    private final Phase to;

    Transition(Phase from, Phase to) {
      this.from = from;
      this.to = to;
    }

    // 상전이 맵을 초기화한다.
    private static final Map<Phase, Map<Phase, Transition>> transitionMap;

    static {
      transitionMap = Stream.of(values()).collect(groupingBy(t -> t.from,
          () -> new EnumMap<>(Phase.class), Collectors.toMap(t -> t.to,
              t -> t,
              (x, y) -> y,
              () -> new EnumMap<>(Phase.class))));
    }

    public static Transition from(Phase from, Phase to) {
      return transitionMap.get(from).get(to);
    }
  }

}
