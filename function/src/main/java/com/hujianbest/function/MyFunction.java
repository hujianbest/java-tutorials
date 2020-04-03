package com.hujianbest.function;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author hujian
 */
@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T t);

    default <V> MyFunction<T, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }
}
