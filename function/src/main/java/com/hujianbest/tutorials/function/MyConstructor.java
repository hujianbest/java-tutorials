package com.hujianbest.tutorials.function;

/**
 * @author hujian
 */
@FunctionalInterface
public interface MyConstructor<T> {
    T get(int i);
}
