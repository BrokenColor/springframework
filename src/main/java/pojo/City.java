package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: GWL
 * @Description: 组件 装配bean
 * @Date: Create in 12:59 2019/5/23
 * 无法重写初始化销毁方法
 */
@Component("MyCity")
public class City {

    @Autowired
    private CityService cityService;

    @Override
    public String toString() {
        return "City:[CityService = " + cityService + "]";
    }
}
