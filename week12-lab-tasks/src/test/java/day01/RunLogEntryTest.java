package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RunLogEntryTest {
    @Test
    void createTest() {
        RunLogEntry rle = new RunLogEntry("7.1 km;2021-11-28");
        assertEquals(7.1, rle.getDistance());
        assertEquals(LocalDate.of(2021, 11, 28), rle.getDate());
    }
}