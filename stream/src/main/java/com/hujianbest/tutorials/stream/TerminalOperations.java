package com.hujianbest.tutorials.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author hujian
 */
public class TerminalOperations {
    public int[] toArrays(IntStream stream) {
        return stream.toArray();
    }

    public Object[] toArrays(Stream<?> stream) {
        return stream.toArray();
    }

    public void application(Stream<?> stream) {
        stream.forEach(System.out::println);
    }

    public List<?> collect2List(Stream<?> stream) {
        return stream.collect(Collectors.toList());
//        return stream.collect(Collectors.toCollection(LinkedList::new));
    }

    public Set<?> collect2Set(Stream<?> stream) {
        return stream.collect(Collectors.toSet());
//        return stream.collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Map<?, ?> collect2Map(Stream<?> stream) {
        return stream.collect(Collectors.toMap(Object::toString, Object::getClass));
    }

    public Optional<?> reduce(Stream<Integer> stream) {
        return stream.reduce(Integer::sum);
    }

    public Boolean match(Stream<Integer> stream) {
        return stream.anyMatch(integer -> integer > 10);
//        return stream.allMatch(integer -> integer > 10);
//        return stream.noneMatch(integer -> integer > 10);
    }

    public Optional<?> find(Stream<Integer> stream) {
        return stream.findFirst();
//        return stream.findAny();
    }

    public Long calc(Stream<Integer> stream){
        return stream.count();
    }

    public OptionalDouble calcInt(IntStream stream){
        return stream.average();
//        return stream.sum();
//        return stream.max();
    }
}
