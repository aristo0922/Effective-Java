package ch06.transientTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class TransientMain {

  public static void main(String[] args) {
    Member member = new Member("김정수", "justice@XDinaryHeros.jyp.com", 24);
    byte[] serialData = serializeTest(member);
    deSerializeTest(serialData);
  }

  public static byte[] serializeTest(Member member){
    byte[] serializedMember;
    try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()){
      try(ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)){
        oos.writeObject(member) ;
        serializedMember = byteArrayOutputStream.toByteArray();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    System.out.println("SERIALIZED: ");
    System.out.println(Base64.getEncoder().encodeToString(serializedMember));
    System.out.println();
    return  serializedMember;
  }

  public static void deSerializeTest(byte[] member){
    byte[] serializedMember = member;
    try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedMember)){
      try(ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)){
        Object objectMember = objectInputStream.readObject();
        Member result = (Member) objectMember;
        System.out.println(result);
      } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}
