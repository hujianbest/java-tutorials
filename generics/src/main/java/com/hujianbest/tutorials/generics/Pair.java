package com.hujianbest.tutorials.generics;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author hujian
 */
@Data
@AllArgsConstructor
public class Pair<T> {
    private T first;
    private T second;

    public static void main(String[] args) {
        Pair<String> pair1 = new Pair<>("Hello", "World");
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
        System.out.println(pair1.getFirst().contains("H"));

        Pair<?> pair2 = new Pair<>("Hello", "World");
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());
        System.out.println(pair2.getFirst().hashCode());

        Pair<? extends Number> pair3 = new Pair<>(1, 2L);
        System.out.println(pair3.getFirst() + " " + pair3.getSecond());
        System.out.println(pair3.getFirst().doubleValue());


    }
}
