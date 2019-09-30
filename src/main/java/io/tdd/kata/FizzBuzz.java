package io.tdd.kata;

public class FizzBuzz {
    public String countTo(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                result.append(", ");
            }
            result.append(numberToToken(i));
        }
        return result.toString();
    }

    protected String numberToToken(int i) {
        String number = String.valueOf(i);
        if (isDivedBy(i, 15)) {
            number = "FizzBuzz";
        } else if (isDivedBy(i, 3)) {
            number = "Fizz";
        } else if (isDivedBy(i, 5)) {
            number = "Buzz";
        }
        return number;
    }

    private boolean isDivedBy(int i, int i2) {
        return i % i2 == 0;
    }
}
