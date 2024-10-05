package numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    static List<Integer> boxing(){

        return IntStream.range(1,6)
                .boxed()
                .toList();
    }

    static int unboxing(List<Integer> integerList){

        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("Convert Primitive to List : " + boxing());

        List<Integer> integerList = boxing();

        System.out.println("Sum using unboxing : "  + unboxing(integerList));
    }
}
