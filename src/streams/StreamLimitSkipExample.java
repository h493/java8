package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    static Optional<Integer> limit(List<Integer> integerList){

        return integerList.stream()
                .limit(3)
                .reduce(Integer::sum);
    }

    static Optional<Integer> skip(List<Integer> integerList){

        return integerList.stream()
                .skip(3)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);

        System.out.println(limit(integers));
        System.out.println(skip(integers));
    }
}
