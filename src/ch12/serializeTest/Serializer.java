package ch12.serializeTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer<T extends Object> {

  public byte[] serialize(T object) {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try (bos; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
      oos.writeObject(object);
    } catch (Exception e) {
      System.out.println("[Serialize] system error");
    }
    return bos.toByteArray();
  }

  public T deserialize(byte[] serializedData){
    ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
    try ( bis; ObjectInputStream ois = new ObjectInputStream(bis)){
      Object object = ois.readObject();
      return (T) object;
    }catch(Exception e){
      System.out.println("[Deserialize] system error");
    }
    return null;
  }
}
