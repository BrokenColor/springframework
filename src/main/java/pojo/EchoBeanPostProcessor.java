package pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: GWL
 * @Description: 针对所有Spring上下文中所有的bean 每个bean初始化的时候调用
 * 对所有的bean进行一个初始化之前和之后的代理
 * 不能返回null 否则无法获取
 * @Date: Create in 10:46 2019/5/26
 *
 * 如果你有一个需求，打印项目中方法每个方法的运行时长，你很容易想到用AOP去做，
 * 如果不用AOP的话那么你可以使用BeanPostProcessor的后置处理方法,
 * 将对应的每个Bean都进行动态代理。
 *
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

    /**
     * postProcessBeforeInitialization方法在bean初始化之前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=============postProcessBeforeInitialization==================" + beanName);
        return bean;
    }

    /**
     * postProcessAfterInitialization方法在bean初始化之后执行。
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=============postProcessAfterInitialization==================" + beanName);
        return bean;
    }
}
