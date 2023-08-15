import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<> (List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Нечетные числа из последовательности:");
        PrintOddNumbers.printOddNumbers(nums);
        System.out.println();

        System.out.println("Четные и в порядке возрастания:");
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, -2, 3, 4, 4, 5, 5, 6, 7, 9, 11, 12, 14, 2));
        EvenNumbersWithoutDuplicates.evenNumbersWithoutDuplicates(numbers);
        System.out.println();

        System.out.println("Уникальные слова:");
        List<String> wordslist = new ArrayList<>(List.of("qwe", "qwe1", "qwe", "rqw"));
        UniqueWords.uniqueWords(wordslist);
        System.out.println();

        System.out.println("Повторы слов:");
        List<String> strings = new ArrayList<String>(List.of("один", "один", "два","два", "три", "три", "три"));
        RepeatWords.repeatWords(strings);
    }
}