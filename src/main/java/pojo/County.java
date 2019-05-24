package pojo;

import org.springframework.stereotype.Component;

/**
 * @Author: GWL
 * @Description: 构造函数注入
 * @Date: Create in 15:00 2019/5/24
 * 注意
 * 1，构造函数只能有一个 如果有多个的话，就必须默认有无参构造函数，此时spring会调用无参构造函数
 * 2，构造函数的参数必须都要在spring容器中存在
 */
@Component
public class County {

    private Monkey monkey;

    public County(Monkey monkey){
        this.monkey = monkey;
    }

    public void show(){
        System.out.println("monkey:" +monkey);
    }
}
