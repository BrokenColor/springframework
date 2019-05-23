package config;

import factory.CarFactory;
import factory.RunnableFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import pojo.*;

/**
 * @Author: GWL
 * @Description: 配置类
 * @Date: Create in 9:25 2019/5/23
 */
@Configuration
public class BeanConfig {

    /**
     * 装配bean
     * @return
     * 自定义名称bean  name = "MyUser"
     *  默认bean为单例，可以通过@Scope("prototype")修改为非单例
     */
    @Bean(name = "MyUser")
    @Scope("prototype")
    public User createUser(){
        return new User();
    }

    /**
     * FactoryBean
     * @return
     */
    @Bean
    public RunnableFactoryBean creatFactoryBean(){
        return new RunnableFactoryBean();
    }

    @Bean
    public CarFactory createCarFactory(){
        return new CarFactory();
    }

    /**
     * 参数从Spring容器中获取
     * @param carFactory
     * @return
     */
    @Bean
    public Car createCar(CarFactory carFactory){
        return carFactory.create();
    }

    @Bean
    public Cat createCat(){
        return new Cat();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog createDog(){
        return new Dog();
    }

    @Bean
    public Animal createAnimal(){
        return new Animal();
    }

    /**
     * 通过@Compent 装配bean的同时也可以通过@bean装配
     * 但是在获取的时候不能根据类型获取 否则会报错
     * 当装配了多个bean时
     * 可通过@Primary注解 表示当装配多个bean，首选被@Primary注解的bean
     * @return
     */
    @Bean
    @Primary
    public City createCity(){
        return new City();
    }

}
