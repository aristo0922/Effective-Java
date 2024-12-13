package ch12.item88;

import java.io.Serializable;
import java.util.Date;

public class InvalidPeriod implements Period {
  private final Date start;
  private final Date end;

  public InvalidPeriod(Date start, Date end) {
    this.start = start;
    this.end = end;
  }

  public Date start(){
    return new Date(start.getTime());
  }

  public Date end(){
    return new Date(end.getTime());
  }

  public String toString(){
    return start + " - " + end;
  }
}
