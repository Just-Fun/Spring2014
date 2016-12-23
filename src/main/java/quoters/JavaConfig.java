package quoters;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Sergey on 12/23/16.
 */
@Configuration
@ComponentScan("quoters")
public class JavaConfig {

    /*@Bean
    public CoolDao() {
        return new CoolDaoImpl();
    }

    @Bean(initMethod = "init")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CoolService coolService() {
        CoolServiceImpl service = new CoolServiceImpl();
        service.sedDao(dao());
        return service;
    }*/
}
