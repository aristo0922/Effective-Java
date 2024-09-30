package ch03;

public class PhoneNumber {
  private final short areaCode, prefix, lineNum;
  public PhoneNumber(int areaCode, int prefix, int lineNum){
    this.areaCode = rangeCheck(areaCode, 999, "지역코드");
    this.prefix = rangeCheck(prefix, 999, "프리픽스");
    this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
  }

  private static short rangeCheck(int val, int max, String arg){
    if (val < 0 || val > max)
      throw new IllegalArgumentException(arg + ": "+val);
    return (short) val;
  }

  @Override
  public boolean equals(Object o){
    if (o == this){
      return true;
    }
    if(!(o instanceof PhoneNumber))
      return false;
    PhoneNumber pn = (PhoneNumber) o;
    return pn.lineNum == lineNum &&
        pn.prefix == prefix &&
        pn.areaCode == areaCode;
  }

  public static void main(String[] args){
    PhoneNumber pn1 = new PhoneNumber(064, 722, 0220);
    PhoneNumber pn2 = new PhoneNumber(064, 722, 0220);
    PhoneNumber pn3 = new PhoneNumber(064, 722, 1234);

    System.out.println(pn1.equals(pn1));

    System.out.println(pn1.equals(pn2));
    System.out.println(pn2.equals(pn1));

    System.out.println(pn2.equals(pn3));
    System.out.println(pn1.equals(pn3));

    System.out.println(pn3.equals(pn1));
    System.out.println(pn3.equals(pn2));
  }

}
