package ch11;

import java.util.concurrent.atomic.AtomicLong;

public class code78_5 {
  private static final AtomicLong nextSerialNum = new AtomicLong();

  public static long generateSerialNumber(){
    return nextSerialNum.getAndIncrement();
  }

}
