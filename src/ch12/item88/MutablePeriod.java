package ch12.item88;

import ch12.serializeTest.Serializer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public class MutablePeriod {
  public final PeriodImpl period;
  public final Date start;
  public final Date end;

  public MutablePeriod() {
    Serializer<Period> serializer = new Serializer<>();
    try{
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      byte[] result = serializer.serialize(new PeriodImpl(new Date(), new Date()));
      byte[] ref = { 0x71, 0, 0x7e, 0, 5};
      bos.write(result);
      bos.write(ref);
      ref[4] = 4;
      bos.write(ref);

      ObjectInputStream in = serializer.intputStream(bos);
      period = (PeriodImpl) in.readObject();
      start = (Date) in.readObject();
      end = (Date) in.readObject();
    }catch (IOException | ClassNotFoundException e){
      throw new AssertionError(e);
    }
  }
}
