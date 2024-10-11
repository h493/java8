package defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{
    @Override
    public int add(List<Integer> integerList) {
        return integerList.stream().reduce(0,Integer::sum);
    }
}
