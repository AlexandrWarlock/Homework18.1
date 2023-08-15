import java.util.List;

public class PrintOddNumbers {

    public static void printOddNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}