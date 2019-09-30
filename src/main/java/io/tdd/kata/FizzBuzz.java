package io.tdd.kata;

import static java.lang.Math.min;

public class FizzBuzz {
    public String countTo(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                result.append(", ");
            }
            result.append(numberToToken(i));
        }
        return wrapLine(result.toString(), 14);
    }

    protected String wrapLine(String str, int width) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i+=width) {
            if (i + width < str.length()) {
                builder.append(str, i, i+width);
                builder.append("\n");
            } else {
                builder.append(str, i, str.length());
            }
        }
        return builder.toString();
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
