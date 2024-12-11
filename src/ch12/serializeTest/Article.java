package ch12.serializeTest;

import java.io.Serializable;

public class Article implements Serializable {
  private transient Integer id; // 직렬화에서 제외되는 필드
  private String title;
  private String pressName;
  private String reporterName;

  public Article(Integer id, String title, String pressName, String reporterName){
    this.id = id; // Integer 참조 객체형이어야 하는 이유가 있나?-> default 값(null) 설정 때문. int 사용 시 default(0)
    this.title= title;
    this.pressName= pressName;
    this.reporterName = reporterName;
  }

  @Override
  public String toString(){
    return String.format("id = %s, title = %s, pressName = %s, reporterName = %s",
        id, title, pressName, reporterName);

  }
}
