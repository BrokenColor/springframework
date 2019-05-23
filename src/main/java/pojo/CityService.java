package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: GWL
 * @Description: 服务层 @Service 注解 装配bean
 * @Date: Create in 13:12 2019/5/23
 */
@Service
public class CityService {
    /**
     * 依赖注入
     */
    @Autowired
    private CityDAO cityDAO;

    public String toString() {
        return "CityService:[CityDAO = " + cityDAO + "]";
    }
}
