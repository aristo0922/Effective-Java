package ch06.item39;

import java.lang.reflect.Method;

public class RunTest3 {

  public static void main(String[] args) throws Exception{
    int tests = 0;
    int passed = 0;
    Class<?> testClass = Class.forName("ch06.item39.Sample3");

    for(Method m : testClass.getDeclaredMethods()){
      if(m.isAnnotationPresent(ExceptionTest2.class)){
        tests++;
        try{
          m.invoke(null);
          System.out.printf(" 테스트 %s 실패 : 예외를 던지지 않음%n", m);
        }catch(Throwable wrappedExc){
          Throwable exc =wrappedExc.getCause();
          int oldPassed = passed;
          Class<? extends Throwable>[] excTypes = m.getAnnotation(ExceptionTest2.class).value();

          for(Class<? extends Throwable> excType: excTypes){
            if(excType.isInstance(exc)){
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
