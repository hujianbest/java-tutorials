package com.hujianbest.tutorials.function;

/**
 * @author hujian
 */
public class Person {
    public String name(int id) {
        return String.valueOf(id);
    }

    public String nickname(int id, String name) {
        return name + "-" + id;
    }
}