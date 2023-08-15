import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWords {
    public static void uniqueWords(List<String> wordsList) {
        Set<String> differentWords = new HashSet<>(wordsList);
        for (String uniqueWord : differentWords) {
            System.out.print(uniqueWord + " ");
        }
    }
}
