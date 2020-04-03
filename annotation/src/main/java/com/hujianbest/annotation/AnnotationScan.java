package com.hujianbest.annotation;

import java.lang.reflect.Field;

/**
 * @author hujian
 */
public class AnnotationScan {
    public static void scan(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            AutoInit autoInit = field.getAnnotation(AutoInit.class);
            if (autoInit != null) {
                field.setAccessible(true);
                field.set(obj, autoInit.value());
            }
        }
    }
}
