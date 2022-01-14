package day05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {
    StringStatistics stringStatistics = new StringStatistics();
    @Test
    void summarizeCharacters() {
        assertEquals(Map.of('a', 3, 'b', 2, 'k', 3, '1',1),
                stringStatistics.summarizeCharacters("aaabbkkk1"));
    }
}