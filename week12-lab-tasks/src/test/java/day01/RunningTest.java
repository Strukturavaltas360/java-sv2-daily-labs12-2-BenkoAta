package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    @Test
    void createTest() {
        Running running = new Running(Path.of("src/test/resources/day01/running.csv"));
        assertEquals(7, running.getLog().size());
    }

    @Test
    void getTotalDistance() {
        Running running = new Running(Path.of("src/test/resources/day01/running.csv"));
        assertEquals(41.2, running.getTotalDistance(2021, 12));
    }
}