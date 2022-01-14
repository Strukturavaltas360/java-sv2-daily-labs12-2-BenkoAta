package day05;

import java.util.Map;
import java.util.TreeMap;

public class StringStatistics {
    public Map<Character, Integer> summarizeCharacters(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Text is empty!");
        }
        Map<Character, Integer> result = new TreeMap<>();
        for (char ch : text.toCharArray()) {
            Integer count = result.get(ch);
            result.put(ch, count != null ? count + 1 : 1);
        }
        return result;
    }
}
