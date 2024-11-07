package ch09;

public class Item63_1 {
  String[] lines = {"he", " ", "is"," ", "rocker!"};
  static int LINE_WIDTH;

  public String statement(int length){
    String result = "";
    for (int i =0; i< length; i++){
      result += lineForItem(i);
    }
    return result;
  }

  public String statement2(){
    StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH * 99999);
    for(int i = 0; i < LINE_WIDTH * 99999; i++)
      b.append(lineForItem(i));
    return b.toString();
  }

  String lineForItem(int i){
    int len = numItems();
    return lines[i%len];
  }

  int numItems(){
    return lines.length;
  }

  public static void main(String[] args) {
    Item63_1 item = new Item63_1();
    LINE_WIDTH = item.numItems();
    long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

    System.out.println(item.statement2());

    long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
    long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
    System.out.println("시간차이(m) : "+secDiffTime);
  }

}
