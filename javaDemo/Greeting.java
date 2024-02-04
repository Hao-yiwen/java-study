import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 指定注解在运行时保留，因此可以通过反射读取
@Retention(RetentionPolicy.RUNTIME)
// 指定注解只能应用于方法上
@Target(ElementType.METHOD)
public @interface Greeting{
    String value() default "Hello";
}