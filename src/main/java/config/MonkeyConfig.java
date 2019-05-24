package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.Monkey;

/**
 * @Author: GWL
 * @Description:
 * @Date: Create in 13:28 2019/5/24
 */
@Configuration
public class MonkeyConfig {

    @Bean
    public Monkey createMonkey(){
        return new Monkey();
    }
}
