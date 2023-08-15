import java.util.*;

public class RepeatWords {
    public static void repeatWords(List<String> wordsList) {
        Map<String, Integer> repeatWords = new HashMap();
        for (String word : wordsList) {
            repeatWords.put(word, repeatWords.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : repeatWords.entrySet()) {
            String word = stringIntegerEntry.getKey();
            int count = stringIntegerEntry.getValue();
            System.out.print(count + " ");
        }
    }
}
