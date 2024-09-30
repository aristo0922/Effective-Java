package ch03.item10.transivity;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point{

  private static final AtomicInteger counter = new AtomicInteger();
  private static final Set<Point> unitCircle = Set.of(
      new Point(1, 0), new Point(0, 1),
      new Point(-1, 0), new Point(0, -1)
  );
  public static boolean onUnitCircle(Point p){
    return unitCircle.contains(p);
  }

  // 만들어진 인스턴스 수를 생성자에서 세보자
  public CounterPoint(int x, int y) {
    super(x, y);
    counter.incrementAndGet();
  }

  public static int numberCreated() {return counter.get();}
}
