package operator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StaticUtils {
    public StaticUtils() {}

    public static List<Integer> range(int start, int end) {
        return IntStream.range(start, end)
                .boxed()
                .collect(Collectors.toList());
    }

    public static String name() {
        return "Baeldung";
    }

    public int subtract(int a, int b){
        return a - b;
    }

}
