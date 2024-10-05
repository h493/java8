package streams;

import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    static Optional<Integer> maxValue(List<Integer> integerList){
        return integerList.stream()
                //.reduce((x,y) -> x>y ? x:y);
                .reduce(Integer::max);
    }

    static Optional<Integer> minValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y) -> x>y ? y : x);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(6,7,8,9);

        System.out.println(maxValue(integerList).isPresent() ? maxValue(integerList).get() : 0);
        System.out.println(minValue(integerList));

    }
}
