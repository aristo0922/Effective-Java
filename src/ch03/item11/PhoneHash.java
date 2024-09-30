package ch03.item11;

import ch03.item10.PhoneNumber;
import java.util.HashMap;
import java.util.Map;

public class PhoneHash {
  Map<PhoneNumber, String> m;

  PhoneHash(){
    m = new HashMap<>();
    m.put(new PhoneNumber(707, 867, 5309), "제니");
    System.out.println(m.get(new PhoneNumber(707, 867, 5309))); // null
  }

  public static void main(String[] arg){
    PhoneHash hash = new PhoneHash();
  }

}
