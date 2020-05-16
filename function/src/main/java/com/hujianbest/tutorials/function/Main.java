package com.hujianbest.tutorials.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
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
        System.out.println(test("Hello", ((MyFunction<String, String>) s1 -> s1 + " World! ").andThen(s -> s + " ni hao!")));

        MyObject object = getObject(MyObject::new);
        object.say();

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> num = nums.stream().filter(((Predicate<Integer>) i -> i < 4).and(i -> i > 1).or(i -> i == 5)).collect(Collectors.toList());
        num.forEach((System.out::println));

        Person person = new Person();
        Function<Integer, String> name = person::name;
        System.out.println(name.apply(1));

        BiFunction<Integer, String, String> nickname = person::nickname;
        System.out.println(nickname.apply(1, "jack"));

        Function<Integer, String> age = Person::age;
        System.out.println(age.apply(2));

        Supplier<Person> constructor1 = Person::new;
        constructor1.get();

        MyConstructor<Person> constructor2 = Person::new;
        constructor2.get(6);
    }
}
