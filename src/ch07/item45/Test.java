package ch07.item45;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Test {

  public static void main(String[] args) {
    String sentence = "Hello world!";
    sentence.chars().forEach(x -> System.out.print((char) x));

  }

  static Stream<BigInteger> primes(){
//    return Stream.iterate(TWO, BigInteger::nextProbablePrime);
  }
}
