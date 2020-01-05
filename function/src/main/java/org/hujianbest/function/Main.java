package org.hujianbest.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author hujian
 */
public class Main {
    public static String test(String string, MyFunction<String, String> function) {
        return function.apply(string);
    }

    public static <T> T getObject(Supplier<T> constructor) {
        return constructor.get();
    }

    public static void main(String[] args) {
        System.out.println(test("Hello", (String s) -> s + " World! "));
        System.out.println(test("Hello", s -> s + " World! "));

        MyObject object = getObject(MyObject::new);
        object.say();

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> predicate = i -> i < 4;
        List<Integer> num = nums.stream().filter(predicate.and(i -> i > 1).or(i -> i == 5)).collect(Collectors.toList());
        num.forEach((System.out::println));
    }
}
