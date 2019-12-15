package org.hujinabest.annotation;

/**
 * @author hujian
 */
public class Car {
    @AutoInit(value = "BMW")
    private String name;

    @AutoInit(value = "120")
    private String speed;

    public void play() {
        System.out.println(String.format("This is %s, run in speed %s km/h", name, speed));
    }
}
