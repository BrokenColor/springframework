package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @Author: GWL
 * @Description: 组件 装配bean
 * @Date: Create in 12:59 2019/5/23
 * 无法重写初始化销毁方法
 * @Autowired 是spring自带的，
 * @Inject 是JSR330规范实现的，
 * @Resource 是JSR250规范实现的，需要导入不同的包
 */
@Component("MyCity")
public class City {

    //spring 的注入方式
    @Autowired
    private CityService cityService;

    //JSR250规范实现的
    @Resource
    private Cat cat;

    //JSR330规范实现的
    @Inject
    private Car car;

    @Override
    public String toString() {
        return "City:[CityService = " + cityService + ",cat= "+ cat+",car= "+ car+"]";
    }
}
