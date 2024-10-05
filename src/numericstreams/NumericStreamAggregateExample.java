package numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.range(1,20).sum();
        System.out.println("Sum : " + sum);

        OptionalInt max = IntStream.rangeClosed(1,20).max();
        System.out.println(max.isPresent() ? max.getAsInt() : "Empty Stream");

        OptionalInt min = IntStream.range(1,20).min();
        System.out.println(min.isPresent() ? min.getAsInt() : "Empty Stream");

        OptionalInt emptyMax = IntStream.range(1,1).max();
        System.out.println(emptyMax.isPresent() ? emptyMax.getAsInt() : "Empty Stream");

        OptionalDouble avg = LongStream.rangeClosed(1,50).average();
        System.out.println(avg.getAsDouble());


    }
}
