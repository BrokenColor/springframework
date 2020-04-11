import config.AnnotationConfig;
import config.BeanConfig;
import factory.RunnableFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.*;

/**
 * @Author: GWL
 * @Description: 装配bean 测试
 * @Date: Create in 9:23 2019/5/23
 */

public class Application_bean {
    public static void main(String[] args) {
        System.out.println("hello world");
        //基于注解
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class,
                City.class, CityDAO.class, CityService.class,CityController.class);
//        //扫描packages
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("pojo","config");
//        //在配置类中扫描bean
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        //获取bean方式-根据类型获取
        System.out.println(context.getBean(User.class));
        //获取bean方式-根据名字获取
        System.out.println(context.getBean("MyUser"));

        //获取bean方式-FactoryBean 通过类型获取
        System.out.println(context.getBean(Jeep.class));
        //获取bean方式-FactoryBean 通过名字获取
        System.out.println(context.getBean("creatFactoryBean"));
        //获取FactoryBean本身 通过类型获取
        System.out.println(context.getBean(RunnableFactoryBean.class));
        //获取FactoryBean本身 通过名字获取
        System.out.println(context.getBean("&creatFactoryBean"));

        //获取bean方式-根据类型获取
        System.out.println(context.getBean(Car.class));

        //在bean创建和销毁时处理需求 方式一
        System.out.println(context.getBean(Cat.class));
        //在bean创建和销毁时处理需求 方式二
        System.out.println(context.getBean(Dog.class));
        //在bean创建和销毁时处理需求 方式二
        System.out.println(context.getBean(Animal.class));
        //对比三种bean创建和销毁时机
        System.out.println(context.getBean(Bird.class));

        //通过@Component 装配bean
        System.out.println(context.getBean(City.class));
        //根据名字获取-默认类首字母小写
//        System.out.println(context.getBean("city"));
        //根据名字获取-自定义名字
        System.out.println(context.getBean("MyCity"));

        System.out.println(context.getBeansOfType(City.class));
        //通过@Repository 装配bean
        System.out.println(context.getBean(CityDAO.class));
        //通过@Service 装配bean
        System.out.println(context.getBean(CityService.class));
        //通过@Controller 装配bean
        System.out.println(context.getBean(CityController.class));

        //依赖注入
        City city = context.getBean("MyCity",City.class);
        System.out.println(city);

        /**
         * 1，依赖注入 时有多个bean实例
         * 可在配置类（BeanConfig）中通过@Primary注解
         * 表示当装配多个bean，首选被@Primary注解的bean
         */
        System.out.println(context.getBeansOfType(City.class));

        /**
         * 2，依赖注入时有多个bean实例 可通过@Qualifier注解指定要加载的依赖
         */
        System.out.println(context.getBeansOfType(CityController.class));

        context.close();
    }
}
