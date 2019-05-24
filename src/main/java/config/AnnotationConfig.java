package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import pojo.CityController;

/**
 * @Author: GWL
 * @Description: 扫描bean包
 * @Date: Create in 13:11 2019/5/24
 * 排除Monkey.class,CityController.class
 */
@ComponentScan(basePackages = {"pojo","config"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {MonkeyConfig.class,CityController.class}))
@Configuration
public class AnnotationConfig {
}
