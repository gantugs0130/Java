package lab14_1;

import java.util.*;
import java.util.stream.Collectors;

public class SupplyAsyncExample {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new Random().ints(10, 0, 100).toArray();
        IntSummaryStatistics listEven = Arrays.stream(array).filter(n -> {
            return n%2==0;
        }).summaryStatistics();

    }
}