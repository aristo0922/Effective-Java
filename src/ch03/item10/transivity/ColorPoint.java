package ch03.item10.transivity;

import java.util.Objects;

public class ColorPoint{

  private final Color color;
  private final Point point;

  public ColorPoint(int x, int y, Color color) {
    point = new Point(x, y);
    this.color = Objects.requireNonNull(color);
  }

  public Point asPoint(){
    return point;
  }

  // 추이성 위배
  @Override
  public boolean equals(Object o){
    if(!(o instanceof Point))
      return false;

    // o가 일반 Point 이면 색상 무시 후 비교
    if (!(o instanceof ColorPoint))
      return o.equals(this);

    // o 가 ColorPoint 면 색상까지 비교
    return super.equals(o) && ((ColorPoint) o).color == color;
  }
  public static void main(String[] args){
    ColorPoint cp1 = new ColorPoint(1,2, Color.RED);
    Point point = new Point(1,2);
    ColorPoint cp2 = new ColorPoint(1,2, Color.BLUE);

    System.out.println(cp1.equals(point)); // true
    System.out.println(point.equals(cp2));
    System.out.println(cp1.equals(cp2)); // false
  }
}
