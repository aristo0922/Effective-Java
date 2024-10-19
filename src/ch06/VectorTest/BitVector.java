package ch06.VectorTest;

public class BitVector {
//  boolean isUniqueChars(String str){
//    boolean[] alphabet_set = new boolean[26];
//
//    for(int i = 0; i < str.length(); i++){
//      int val = str.charAt(i) - 'a';
//      if (alphabet_set[val])
//        return false;
//      alphabet_set[val] = true;
//    }
//    return true;
//  }

  boolean isUniqueChars(String str){
    int checker = 0;
    for (int i = 0; i < str.length(); i++){
      int val = str.charAt(i) - 'a';
      if((checker & (1 << val)) > 0)
        return false;
      checker |= (1 << val);
    }
    return true;
  }

}
