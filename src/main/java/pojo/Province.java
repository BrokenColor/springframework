package pojo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: GWL
 * @Description: 实现 ApplicationContextAware 依赖注入
 * @Date: Create in 14:50 2019/5/24
 */
@Component
public class Province implements ApplicationContextAware {

    private ApplicationContext context;

    private Dog dog;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        this.dog = applicationContext.getBean(Dog.class);
    }

    public void show(){
        System.out.println("province:" + context.getClass()+" dog:" + dog);
    }
}
