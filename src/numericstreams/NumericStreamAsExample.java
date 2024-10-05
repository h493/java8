package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAsExample {

    static double doubleStream(){

        return IntStream.range(1,5)
                .asDoubleStream()
                .sum();
    }

    static long longStream() {

        return LongStream.range(1,5)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(doubleStream());
        System.out.println(longStream());
    }
}
