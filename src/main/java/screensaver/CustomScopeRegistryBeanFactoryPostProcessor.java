package screensaver;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import screensaver.PeriodicalScopeConfigurer;

/**
 * Created by Sergey on 12/27/16.
 */

@Component
public class CustomScopeRegistryBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerScope("periodical", new PeriodicalScopeConfigurer());
    }
}
