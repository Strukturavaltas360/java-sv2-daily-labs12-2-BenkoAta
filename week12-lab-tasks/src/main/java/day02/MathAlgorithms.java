package day02;

public class MathAlgorithms {
    public int getBigestDivisor(int number1, int number2) {
        if (number1 == number2) {
            return number1;
        }
        if (number1 > number2) {
            return getBigestDivisorOrdered(number1, number2);
        } else {
            return getBigestDivisorOrdered(number2, number1);
        }
    }

    private int getBigestDivisorOrdered(int big, int small) {
        for (int divisor = 1; divisor <= small; divisor ++) {
            int divisor2 = 0;
            if (small % divisor == 0) {
                divisor2 = small / divisor;
                if (big % divisor2 == 0) {
                    return divisor2;
                }
            }
        }
        return 1;
    }
}
