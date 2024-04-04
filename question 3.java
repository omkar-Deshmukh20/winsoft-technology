import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String str = "Hello world! This is a sample string.";
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        
        String[] words = str.split("\\s+");

        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        
        return wordCountMap.size();
    }
}
