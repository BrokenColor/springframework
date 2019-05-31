package pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

/**
 * @Author: GWL
 * @Description:
 * @Date: Create in 10:51 2019/5/23
 * 在bean创建和销毁时处理需求
 */
public class Cat implements InitializingBean,DisposableBean {

    /**
     * 属性设置之后执行
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("==========Cat afterPropertiesSet=========");
    }

    /**
     * 销毁
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("=================Cat destroy==============");
    }
}
