package ch06;

public enum Ensemble {
  SOLO, DUET,TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;

  public int numberOfMuiscians() {
    return ordinal()+1;
  }
}
