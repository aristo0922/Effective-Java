package ch03.transivity;

public class ColorPoint extends Point{

  private final Color color;
  public ColorPoint(int x, int y, Color color) {
    super(x, y);
    this.color = color;
  }

  // 대칭성 위배
  @Override
  public boolean equals(Object o){
    if(!(o instanceof ColorPoint))
      return false;
    return super.equals(o) && ((ColorPoint) o).color == color;
  }
  public static void main(String[] args){
    Point p = new Point(1,2);
    ColorPoint cp = new ColorPoint(1,2, Color.RED);
    System.out.println(p.equals(cp)); // true
    System.out.println(cp.equals(p)); // false
  }
}
