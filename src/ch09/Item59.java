package ch09;

import java.util.Random;

public class Item59 {
  static Random random = new Random();
  static int random(int n){
    return Math.abs(random.nextInt()) % n;
  }

  public static void main(String[] args) {
    int n = 2 * (Integer.MAX_VALUE / 3);
    int low =0;
    for (int i = 0; i < 100000; i++)
      if (random(n) < n / 2)
        low++;
    System.out.println(low);
  }
}
