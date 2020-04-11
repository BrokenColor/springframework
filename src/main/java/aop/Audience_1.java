package aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Description: @Pointcut注解声明频繁使用的切点表达式
 * <p>
 * Author: GWL
 * Date: Create in 15:28 2020/4/11
 */
@Component
@Aspect
public class Audience_1 {

    //定义命名的切点
    @Pointcut("execution(* aop.Performance.perform(..))")
    public void pointcutMethod() {
    }

    //通知方法会在目标方法调用之前执行
    @Before("pointcutMethod()")
    public void Before() {
        System.out.println("Before");
    }

    //通知方法会将目标方法封装起来
    @Around("pointcutMethod()")
    public void Around(ProceedingJoinPoint jp) {
        try {
            System.out.println("Audience1-Around - before");
            jp.proceed();//将控制权交给被通知的方法时
            System.out.println("Audience1-Around - after");
        } catch (Throwable throwable) {
            System.out.println("Audience1-Around - throwable");
            throwable.printStackTrace();
        }
    }

    //通知方法会在目标方法返回或抛出异常后调用
    @After("pointcutMethod()")
    public void After() {
        System.out.println("After");
    }

    //通知方法会在目标方法返回后调用
    @AfterReturning("pointcutMethod()")
    public void AfterReturning() {
        System.out.println("AfterReturning");
    }

    //通知方法会在目标方法抛出异常后调用
    @AfterThrowing("pointcutMethod()")
    public void AfterThrowing() {
        System.out.println("AfterThrowing");
    }
}
