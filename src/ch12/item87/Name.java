package ch12.item87;

import java.io.Serializable;

public class Name implements Serializable {
  /**
   * 성, null이 아니어야 한다.
   * @serial
   * */
  private final String lastName;

  /**
   * 이름, null 이 아니어야 한다.
   * @serial */
  private final String firstName;

  /**
   * 중간이름, 없을 시 null
   * @serial
   * */
  private final String middleName;

  Name(String lastName, String firstName, String middleName){
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
  }

}
