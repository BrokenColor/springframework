import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Car;
import pojo.Country;
import pojo.County;
import pojo.Province;

/**
 * @Author: GWL
 * @Description: 依赖注入多种方式
 * @Date: Create in 13:05 2019/5/24
 * packages
 */
public class Application_1 {

    public static void main(String[] args) {
        //扫描packages
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("pojo","config");
        //依赖注入方式一 注解依赖注入
        System.out.println(context.getBean(Country.class));
        //依赖注入方式二 接口依赖注入
        context.getBean(Province.class).show();
        //依赖注入方式三 构造注入
        context.getBean(County.class).show();
    }
}
