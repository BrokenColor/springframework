package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Author: GWL
 * @Description: @Controller 注解 装配bean
 * @Date: Create in 13:16 2019/5/23
 */
@Controller
public class CityController {

    //当装配多个bean时可通过@Qualifier注解指定要加载的依赖
    @Autowired
    @Qualifier("MyCity")
    private City city;

    @Override
    public String toString() {
        return "city="+city;
    }
}
