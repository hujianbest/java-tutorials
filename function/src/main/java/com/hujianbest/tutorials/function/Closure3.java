package com.hujianbest.tutorials.function;

import java.util.function.IntSupplier;

/**
 * @author hujian
 */
public class Closure3 {
    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> x++ + i++;
    }
}
