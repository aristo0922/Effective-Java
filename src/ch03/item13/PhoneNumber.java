package ch03.item13;

public class PhoneNumber {
  private final short areaCode, prefix, lineNum;
  public PhoneNumber(int areaCode, int prefix, int lineNum){
    this.areaCode = rangeCheck(areaCode, 999, "지역코드");
    this.prefix = rangeCheck(prefix, 999, "프리픽스");
    this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
  }

  public int compareTo(PhoneNumber pn){
    // 가장 중요한 필드
    int result = Short.compare(areaCode, pn.areaCode);
    if (result == 0){
      // 두번재 중요한 필드
      result = Short.compare(prefix, pn.prefix);
      if(result == 0){
        // 세번재 중요한 필드
        result = Short.compare(lineNum, pn.lineNum);
      }
    }
    return result;
  }

  @Override
  public PhoneNumber clone(){
    try{
      return (PhoneNumber) super.clone();
    } catch(CloneNotSupportedException e){
      throw new AssertionError(); // 일어날 수 없는 일이다.
    }
  }

  private static short rangeCheck(int val, int max, String arg){
    if (val < 0 || val > max)
      throw new IllegalArgumentException(arg + ": "+val);
    return (short) val;
  }

  private int hashCode;
  @Override
  public int hashCode(){
    int result = hashCode;
    if(result == 0){
      result = Short.hashCode(areaCode);
      result = 31* result + Short.hashCode(prefix);
      result = 31* result + Short.hashCode(lineNum);
      hashCode = result;
    }
    return result;
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
