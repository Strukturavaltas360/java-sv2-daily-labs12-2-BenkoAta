package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {
    MathAlgorithms mathAlgorithms = new MathAlgorithms();

    @Test
    void getBigestDivisor() {
        assertEquals(20, mathAlgorithms.getBigestDivisor(40, 60));
        assertEquals(9, mathAlgorithms.getBigestDivisor(18, 27));
        assertEquals(5, mathAlgorithms.getBigestDivisor(25, 30));
        assertEquals(1, mathAlgorithms.getBigestDivisor(25, 9));
    }
}