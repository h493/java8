package numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamIntro {

    static int sumOfNumbers(List<Integer> integerList){

        return integerList.stream()
                .reduce(0,(a,b) -> a+b); // unboxing to convert Integer to an int
    }

    static int sumOfNumbersIntStream(){

        return IntStream.rangeClosed(1,6)
                .sum(); //saves the unboxing effort.
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println(sumOfNumbers(integerList));
        System.out.println(sumOfNumbersIntStream());

    }
}
