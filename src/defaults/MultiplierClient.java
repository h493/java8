package defaults;

import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> list  = List.of(1,2,3);
        System.out.println(multiplier.add(list));
        System.out.println(multiplier.size(list));
        System.out.println(Multiplier.isEmpty(list));
    }
}
