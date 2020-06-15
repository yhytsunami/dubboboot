package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created By yhytsunami
 * Date: 2020/3/23
 * Time: 13:59
 * Description:
 */
@SpringBootApplication
public class ConsumerBoot {

    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerBoot.class);
    }

}
