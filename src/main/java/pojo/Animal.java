package pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: GWL
 * @Description: 注解方式 初始化bean方法 销毁bean方法
 * @Date: Create in 11:15 2019/5/23
 */
public class Animal {

    /**
     * bean初始化注解
     */
    @PostConstruct
    public void init(){
        System.out.println("========Animal-@PostConstruct========");
    }

    /**
     * bean销毁注解
     */
    @PreDestroy
    public void destroy(){
        System.out.println("========Animal-@PreDestroy============");
    }
}
