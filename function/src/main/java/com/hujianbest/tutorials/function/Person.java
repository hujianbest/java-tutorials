package com.hujianbest.tutorials.function;

/**
 * @author hujian
 */
public class Person {

    public Person() {
    }

    public Person(int id) {
        System.out.println(id);
    }

    public String name(int id) {
        return String.valueOf(id);
    }

    public String nickname(int id, String name) {
        return name + "-" + id;
    }

    public static String age(int id) {
        return String.valueOf(id);
    }
}