package ch03.item13;

import static java.util.Comparator.comparingInt;

import java.util.Comparator;

public class PhoneNumber {

  private final short areaCode, prefix, lineNum;

  public PhoneNumber(int areaCode, int prefix, int lineNum) {
    this.areaCode = rangeCheck(areaCode, 999, "지역코드");
    this.prefix = rangeCheck(prefix, 999, "프리픽스");
    this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
  }

  private static final Comparator<PhoneNumber> COMPARATOR =
      comparingInt((PhoneNumber pn) -> pn.areaCode)
          .thenComparingInt(pn -> pn.prefix)
          .thenComparingInt(pn -> pn.lineNum);

  public int compareTo(PhoneNumber pn) {
    return COMPARATOR.compare(this, pn);
  }

  @Override
  public PhoneNumber clone() {
    try {
      return (PhoneNumber) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError(); // 일어날 수 없는 일이다.
    }
  }

  private static short rangeCheck(int val, int max, String arg) {
    if (val < 0 || val > max) {
      throw new IllegalArgumentException(arg + ": " + val);
    }
    return (short) val;
  }

  private int hashCode;

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = Short.hashCode(areaCode);
      result = 31 * result + Short.hashCode(prefix);
      result = 31 * result + Short.hashCode(lineNum);
      hashCode = result;
    }
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof PhoneNumber)) {
      return false;
    }
    PhoneNumber pn = (PhoneNumber) o;
    return pn.lineNum == lineNum &&
        pn.prefix == prefix &&
        pn.areaCode == areaCode;
  }

  public static void main(String[] args) {
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
