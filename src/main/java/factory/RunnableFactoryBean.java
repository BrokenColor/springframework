package factory;

import org.springframework.beans.factory.FactoryBean;
import pojo.Jeep;

/**
 * @Author: GWL
 * @Description: 通过FactoryBean
 * @Date: Create in 9:52 2019/5/23
 */
public class RunnableFactoryBean implements FactoryBean<Jeep> {

    /**
     * 获取到创建的实例对象
     * @return
     * @throws Exception
     */
    @Override
    public Jeep getObject() throws Exception {
        return new Jeep();
    }

    /**
     * 什么类型的对象
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Jeep.class;
    }

    /**
     * 是否为单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
