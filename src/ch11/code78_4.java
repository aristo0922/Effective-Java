package ch11;

public class code78_4 {
  private static volatile int nextSerialNumber = 0;
  public static int generateSerialNumber(){
    return nextSerialNumber++;
  }

}
