package org.hujinabest.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author hujian
 */
@Component
public class SpringAnnotationScan implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        Method[] methods = bean.getClass().getMethods();

        for (Field field : fields) {
            AutoInit autoInit = field.getAnnotation(AutoInit.class);
            if (autoInit != null) {
                field.setAccessible(true);
                try {
                    field.set(bean, autoInit.value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return bean;
    }
}
