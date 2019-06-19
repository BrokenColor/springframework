import annotation.Author;
import annotation.BusinessLogic;

import java.lang.reflect.Method;

/**
 * @Author: GWL
 * @Description: 自定义注解
 * @Date: Create in 13:05 2019/6/19
 * packages
 */
public class Application_annotation {

    public static void main(String[] args) {
        Class author = BusinessLogic.class;
        for (Method method: author.getMethods()){
            Author authorAnnotation = method.getAnnotation(Author.class);
            if(authorAnnotation != null){
                System.out.println("method.getName:" + method.getName());
                System.out.println("method.Author:" + authorAnnotation.value());
            }
        }
    }
}
