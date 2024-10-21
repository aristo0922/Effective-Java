package ch06.item39;

import java.lang.reflect.Method;

public class RunTest4 {

  public static void main(String[] args) throws Exception{
    int tests = 0;
    int passed = 0;
    Class<?> testClass = Class.forName("ch06.item39.Sample4");

    for(Method m : testClass.getDeclaredMethods()){
      if(m.isAnnotationPresent(ExceptionTest4.class)){
        tests++;
        try{
          m.invoke(null);
          System.out.printf(" 테스트 %s 실패 : 예외를 던지지 않음%n", m);
        }catch(Throwable wrappedExc){
          Throwable exc =wrappedExc.getCause();
          int oldPassed = passed;
          ExceptionTest4[] execTests = m.getAnnotationsByType(ExceptionTest4.class);

          for(ExceptionTest4 excTest: execTests){
            if(excTest.value().isInstance(exc)){
              passed++;
              break;
            }
          }
          if (passed == oldPassed) {
            System.out.printf("테스트 %s 실패: %s %n", m, exc);
          }
        }
      }
    }
  }
}
