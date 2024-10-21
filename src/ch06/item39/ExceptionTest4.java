package ch06.item39;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 반복 가능한 어노테이션
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(value = ExceptionTestContainer.class)
public @interface ExceptionTest4 {
  Class<? extends Throwable> value();
}
