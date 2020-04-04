package com.hujianbest.tutorials.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author hujian
 */
public class IntermediateOperations {
    public Stream<?> map(Stream<Integer> stream) {
        return stream.map(Object::toString);
    }

    public Stream<?> flatMap(Stream<Integer> stream) {
        return stream.map(Object::toString);
    }

    public Stream<?> track(Stream<Integer> stream) {
        return stream.peek(System.out::println);
    }

    public Stream<?> sort(Stream<Integer> stream) {
        return stream.sorted(Comparator.reverseOrder());
    }

    public Stream<?> removeElements(Stream<Integer> stream) {
        return stream.distinct().filter(integer -> integer > 10);
    }

    public Stream<?> sub(Stream<Integer> stream) {
        return stream.limit(100).skip(10);
    }
}
