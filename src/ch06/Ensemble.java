package ch06;

public enum Ensemble {
  SOLO(1), DUET(2), SOMETHING(2), TRIO(3), QUARTET(4), QUINTET(5), SEXTET(6), SEPTET(7), OCTET(8), NONET(
      9), DECTET(10), TRIPLE_QUARTET(12);

  private final int numberOfMusicians;

  Ensemble(int size) {
    this.numberOfMusicians = size;
  }

  public String getMe(){
    return this.toString();
  }

  public String getConstantName() {
    switch (this.getConstant()) {
      case 1:
        return SOLO.toString();
      case 2:
        return DUET.toString();
      default:
        return null;
    }
  }
  // 코파일럿
  public int getConstant(){
    return numberOfMusicians;
  }

  public int numberOfMuiscians() {
    return numberOfMusicians;
  }
}
