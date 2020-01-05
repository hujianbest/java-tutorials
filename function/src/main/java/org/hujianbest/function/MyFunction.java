package org.hujianbest.function;

/**
 * @author hujian
 */
@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T t);
}
