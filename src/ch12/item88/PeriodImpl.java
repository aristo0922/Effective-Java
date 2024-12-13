package ch12.item88;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Date;


public final class PeriodImpl implements Period {

  private Date start;
  private Date end;

  public PeriodImpl(Date start, Date end) {
    this.start = start;
    this.end = end;
    if (this.start.compareTo(this.end) > 0) {
      throw new IllegalArgumentException(start + " - " + end);
    }
  }

  public Date start() {
    return new Date(start.getTime());
  }

  public Date end() {
    return new Date(end.getTime());
  }

  public String toString() {
    return start + " - " + end;
  }

  public PeriodImpl attack(){
    Date date = start();
    this.start = end();
    this.end = new Date(date.getTime());
    return this;
  }

  private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException{
    s.defaultReadObject();

    if (start.compareTo(end)>0)
      throw new InvalidObjectException(start + " affter " + end);
  }
}
