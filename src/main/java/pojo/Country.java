package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @Author: GWL
 * @Description: 注解依赖注入
 * @Date: Create in 14:44 2019/5/24
 */
@Component("MyCountry")
public class Country {
    //spring 的注入方式
    @Autowired
    private Jeep jeep;

    //JSR250规范实现的
    @Resource
    private Cat cat;

    //JSR330规范实现的
    @Inject
    private Car car;

    @Override
    public String toString() {
        return "Country:[Jeep = " + jeep + ",cat= "+ cat+",car= "+ car+"]";
    }
}
