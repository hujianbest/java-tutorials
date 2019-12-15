package org.hujianbest.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author hujian
 */
public class GenerateOperations {
    public Stream<?> getStreamFromCollections(Collection<?> collection) {
        return collection.stream();
    }

    public Stream<?> getStreamFromMap(Map<?, ?> map) {
        return map.keySet().stream();
    }

    public IntStream getStreamFromArrays(int[] arrays) {
        return Arrays.stream(arrays);
    }

    public IntStream generateIntStream() {
        return IntStream.range(0, 100);
    }

    public IntStream generateRandomStream() {
        return new Random().ints();
    }

    public Stream<?> generateByStream() {
        return Stream.generate(() -> "hello world");
//        return Stream.of(1, 2, 3, 4);
    }
}
