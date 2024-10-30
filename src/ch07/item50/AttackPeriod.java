package ch07.item50;

import java.util.Date;

public class AttackPeriod {

  public static void main(String[] args) {
    Date start = new Date();
    Date end = new Date();
    Period p = new Period(start, end);
    end.setYear(78); // p 내부 수정하기 (deprecated)
  }
}
