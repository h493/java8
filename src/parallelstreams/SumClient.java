package parallelstreams;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {
        Sum sum = new Sum();

        IntStream.range(1,10000)
                .parallel()
                .forEach(sum::performSum);

        System.out.println(sum.getTotal());
    }
}
