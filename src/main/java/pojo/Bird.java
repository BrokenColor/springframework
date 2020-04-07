package pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: bc
 * @DateTime: 2020/4/7 下午5:35
 * @Description: TODO
 */
public class Bird implements InitializingBean, DisposableBean {

    /**
     * bean初始化注解
     */
    @PostConstruct
    public void init(){
        System.out.println("========Bird-@PostConstruct========");
    }

    /**
     * InitializingBean
     * 属性设置之后执行
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() {
        System.out.println("==========Bird afterPropertiesSet=========");
    }

    /**
     * bean初始化自定义
     */
    public void initCustom(){
        System.out.println("========Bird-initCustom========");
    }
    /**
     * bean销毁 自定义
     */
    public void destroyCustom(){
        System.out.println("========Bird-destroyCustom============");
    }

    /**
     * DisposableBean
     * bean销毁
     */
    @Override
    public void destroy(){
        System.out.println("========Bird-DisposableBean-destroy============");
    }
    /**
     * 自定义 bean销毁
     */
    @PreDestroy
    public void preDestroy(){
        System.out.println("========Bird-@PreDestroy============");
    }
}
