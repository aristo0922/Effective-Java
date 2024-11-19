package ch08;

public class Item53 {
  static int sum(int... args){
    int sum = 0;
    for (int arg: args){
      sum += arg;
    }
    return sum;
  }

  static int min(int firstArg, int... remainingArgs){
    int min = firstArg;
    for(int arg: remainingArgs)
      if(arg < min)
        min = arg;
    return min;
  }

  public void foo(){ }
  public void foo(int a1){ }
  public void foo(int a1, int a2){ }
  public void foo(int a1, int a2, int a3){ }
  public void foo(int a1, int a2, int a3, int... rest){ }

  public static void main(String[] args) {
    System.out.printf("");
  }
}
