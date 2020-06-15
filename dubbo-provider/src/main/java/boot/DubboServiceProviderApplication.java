package boot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created By yhytsunami
 * Date: 2020/3/22
 * Time: 17:54
 * Description:
 */
@EnableDubbo
@MapperScan("boot.mybatis.mapper")//扫描mybatis的mapper包
@SpringBootApplication
public class DubboServiceProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(DubboServiceProviderApplication.class);
    }
}
