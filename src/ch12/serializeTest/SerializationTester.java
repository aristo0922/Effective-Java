package ch12.serializeTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTester {

  public byte[] serialize(){
    Article article = new Article(1, "직렬화 테스트", "XH 일보", "VillainMusk");

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)){
      oos.writeObject(article);
    }catch(Exception e){
      System.out.println("[Serialize] system error");
    }

    return bos.toByteArray();
  }

  public Article deserialize(byte[] serializedData){
    ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
    try (bis; ObjectInputStream ois = new ObjectInputStream(bis)){
      Object object = ois.readObject();
      return (Article) object;
    }catch (Exception e){
      System.out.println("[Deserialize] system error");
    }
    return null;
  }

  public static void main(String[] args){
    SerializationTester serializationTester = new SerializationTester();
    byte[] serializedData = serializationTester.serialize();
    Article article = serializationTester.deserialize(serializedData);
    System.out.println(article);
  }
}
