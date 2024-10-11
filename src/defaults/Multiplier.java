package defaults;

import java.util.List;

public interface Multiplier {

    int add(List<Integer> integerList);

    default int size(List<Integer> integerList){
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList){
        return integerList.isEmpty();
    }
}
