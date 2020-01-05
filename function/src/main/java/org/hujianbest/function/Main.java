package org.hujianbest.function;

import java.util.function.Supplier;

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
    }
}
