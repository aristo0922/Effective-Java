package ch12.item88;

import ch12.serializeTest.Serializer;
import java.util.Date;

public class AttackControl {

  public static void main(String[] args) {
//    InvalidPeriod invalid = new InvalidPeriod(new Date(2222, 12, 12), new Date(2024, 12, 1));
//    Serializer<Period> invalidSerializer = new Serializer<>();
//
//    byte[] invalidStream = invalidSerializer.serialize(invalid);
//    System.out.println(invalidSerializer.deserialize(invalidStream));

    PeriodImpl healthPeriod = new PeriodImpl(new Date(2024,12,03), new Date(2024,12,12));
    Serializer<PeriodImpl> serializer = new Serializer<>();

    PeriodImpl attackedPeriod = healthPeriod.attack();
    byte[] streams = serializer.serialize(attackedPeriod);
    PeriodImpl result = serializer.deserialize(streams);
    System.out.println(result);
  }

}
