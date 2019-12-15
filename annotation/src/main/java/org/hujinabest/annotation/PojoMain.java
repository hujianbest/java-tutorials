package org.hujinabest.annotation;

/**
 * @author hujian
 */
public class PojoMain {
    public static void main(String[] args) throws IllegalAccessException {
        Car car = new Car();
        AnnotationScan.scan(car);
        car.play();
    }
}
