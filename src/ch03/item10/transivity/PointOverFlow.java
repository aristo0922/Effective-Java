package ch03.item10.transivity;

public class PointOverFlow {
  public static void main(String [] args){
    ColorPoint cPoint = new ColorPoint(1, 2, Color.RED);
    SmellPoint sPoint = new SmellPoint(1, 2, Smell.CORN);

    System.out.println(cPoint.equals(sPoint));
  }

}
