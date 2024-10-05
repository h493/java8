package numericstreams;


import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    static List<Integer> mapToObj(){

        return IntStream.range(1,6)
                .mapToObj(Integer::valueOf )
                .toList();
    }

    static double mapToDouble(){

        return IntStream.range(1,6)
                .mapToDouble(i->i)
                .sum();
    }

    static long mapToLong(){

        return IntStream.range(1,6)
                .mapToLong(i->i)
                .sum();
    }
    public static void main(String[] args) {

        System.out.println("mapToObj : " + mapToObj());

        System.out.println("mapToDouble() : " + mapToDouble());

        System.out.println("maptoLong() : " + mapToLong());

    }
}
