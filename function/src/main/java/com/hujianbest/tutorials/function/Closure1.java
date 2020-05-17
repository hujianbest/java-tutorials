package com.hujianbest.tutorials.function;

import java.util.function.IntSupplier;

/**
 * @author hujian
 */
public class Closure1 {
    int i = 0;

    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }
}
