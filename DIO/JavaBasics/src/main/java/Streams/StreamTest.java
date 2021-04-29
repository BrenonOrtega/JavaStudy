package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main() {
        var ints = IntStream.of(1,2,3,4,5,6);
        ints.forEach(number -> {
            number *= 2;
            System.out.println(number);
        });

        var ints2 = IntStream.range(0,5);
        ints2.forEach(n -> {
            n *= 5;
            System.out.println(n);
        });
    }
}
