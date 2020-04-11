package aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Description:切面
 * <p>
 * Author: GWL
 * Date: Create in 15:28 2020/4/11
 */
@Component
@Aspect
public class Audience {

    //通知方法会在目标方法调用之前执行
    @Before("execution(* aop.Performance.perform(..))")
    public void Before() {
        System.out.println("Before");
    }

    //通知方法会将目标方法封装起来
    @Around("execution(* aop.Performance.perform(..))")
    public void Around(ProceedingJoinPoint jp) {
        try {
            System.out.println("Audience-Around-before");
            jp.proceed();//将控制权交给被通知的方法时
            System.out.println("Audience-Around - after");
        } catch (Throwable throwable) {
            System.out.println("Audience-Around-throwable");
            throwable.printStackTrace();
        }
    }

    //通知方法会在目标方法返回或抛出异常后调用
    @After("execution(* aop.Performance.perform(..))")
    public void After() {
        System.out.println("After");
    }

    //通知方法会在目标方法返回后调用
    @AfterReturning("execution(* aop.Performance.perform(..))")
    public void AfterReturning() {
        System.out.println("AfterReturning");
    }

    //通知方法会在目标方法抛出异常后调用
    @AfterThrowing("execution(* aop.Performance.perform(..))")
    public void AfterThrowing() {
        System.out.println("AfterThrowing");
    }
}
