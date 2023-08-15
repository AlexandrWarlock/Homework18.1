import java.util.*;

public class EvenNumbersWithoutDuplicates {
    public static void evenNumbersWithoutDuplicates(List<Integer> numbers) {
        Set<Integer> evenNumbersSet = new HashSet<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbersSet.add(num);
            }
        }
        List<Integer> sortedNumbers = new ArrayList<>(evenNumbersSet);
        sortedNumbers.sort(null);
        for (Integer num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }
}