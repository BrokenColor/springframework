package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: GWL
 * @Description: 自定义注解
 * @Date: Create in 17:45 2019/6/19
 *
 * // @Documented –注解是否将包含在JavaDoc中
 * // @Retention –什么时候使用该注解
 * // @Target? –注解用于什么地方
 * // @Inherited – 是否允许子类继承该注解
 *
 * 注解中只有一个属性，可以直接命名为“value”，使用时无需再标明属性名。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String value();
}
