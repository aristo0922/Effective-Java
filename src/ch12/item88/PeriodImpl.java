package ch12.item88;

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
}
