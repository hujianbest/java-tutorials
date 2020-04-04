package com.hujianbest.tutorials.function;

/**
 * @author hujian
 */
@FunctionalInterface
public interface MySupplier<T> {
    T get();
}
