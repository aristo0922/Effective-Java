package ch05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawTypeTest {
  public static void main(String[] args){
    List nums = new ArrayList();

    nums.add("1");
    nums.add("2");
    nums.add(3);
    System.out.println("insert all nums");

    for(int i =0 ; i< nums.size(); i++){
      System.out.println(nums.get(i));
    }

    System.out.println("문제 상황 유발");

    for(Iterator i = nums.iterator(); i.hasNext();){
      String s = (String) i.next();
      System.out.println(s);
    }
  }
}
