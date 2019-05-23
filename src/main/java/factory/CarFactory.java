package factory;

import pojo.Car;

/**
 * @Author: GWL
 * @Description:
 * @Date: Create in 10:44 2019/5/23
 */
public class CarFactory {

    public Car create(){
        return new Car();
    }
}
