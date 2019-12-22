package org.hujianbest.generics;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author hujian
 */
public class Utils {
    public static int getMax(int... nums) {
        return Arrays.stream(nums).max().getAsInt();
    }

    public static <T> T getFirst(T... params) {
        return Arrays.stream(params).findFirst().get();
    }

    public static <T extends Comparable> T getMIin(T... params) {
        List<T> list = Arrays.asList(params);
        Collections.sort(list);
        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(getMax(1, 2, 3, 4));

        int result1 = Utils.<Integer>getFirst(1, 2, 3, 4);
        System.out.println(result1);

        Serializable result2 = Utils.getFirst("1", 2.0, "3", 4L);
        System.out.println(result2);

        Integer result3 = Utils.getMIin(3, 4, 1, 2);
        System.out.println(result3);
    }
}
