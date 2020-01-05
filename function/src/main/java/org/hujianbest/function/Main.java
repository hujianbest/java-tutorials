package org.hujianbest.function;

/**
 * @author hujian
 */
public class Main {
    public static String test(String string, MyFunction<String, String> function) {
        return function.apply(string);
    }

    public static void main(String[] args) {
        System.out.println(test("Hello", (String s) -> s + " World! "));
        System.out.println(test("Hello", s -> s + " World! "));
    }
}
