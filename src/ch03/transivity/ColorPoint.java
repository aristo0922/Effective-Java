package ch03.transivity;

public class ColorPoint extends Point{

  private final Color color;
  public ColorPoint(int x, int y, Color color) {
    super(x, y);
    this.color = color;
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
