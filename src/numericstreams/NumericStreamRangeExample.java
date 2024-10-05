package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Total Number of Elements in Stream : " + intStream.count());

        System.out.println("Total Number of Element in range Closed Stream : " + IntStream.rangeClosed(1,50).count());

        IntStream.range(1,50).forEach(System.out::println);
        IntStream.rangeClosed(1,50).forEach(System.out::println);

        LongStream.range(1,50).forEach(System.out::println);

        //as Double
        IntStream.rangeClosed(1,20).asDoubleStream().forEach(System.out::println);
    }
}
