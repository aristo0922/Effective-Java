package ch12.item90;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public final class Period {
  private final Date start;
  private final Date end;

  /**
   * @param start 시작 시간
   * @param end 종료 시각; 시작 시각보다 뒤여야 한다.
   * @throws IllegalArgumentException 시작 시각이 종료 시각보다 늦을 때 발생한다.
   * @throws NullPointerException start 나 end 가 null 이면 발생한다.
   * */
  public Period(Date start, Date end){
    this.start = new Date(start.getTime());
    this.end = new Date(end.getTime());

    if (this.start.compareTo(this.end) > 0)
      throw new IllegalArgumentException(
          this.start + "가 " + this.end +"보다 늦다."
      );
  }

  public Date start(){
    return new Date(start.getTime());
  }

  public Date end(){
    return new Date(end.getTime());
  }

  private static class SerializationProxy implements Serializable{
    private final Date start;
    private final Date end;

    SerializationProxy(Period p){
      this.start = p.start;
      this.end = p.end;
    }
    private static final long serialVersionUID = 234098243823485285L;

    private Object readResolve(){
      return new Period(start, end);
    }
  }

  private Object writeReplace(){
    return new SerializationProxy(this);
  }

  // 직렬화 프록시 패턴용 readObject 메서드
  private void readObject(ObjectInputStream stream) throws InvalidObjectException {
    throw new InvalidObjectException("프록시가 필요합니다.");
  }
}
