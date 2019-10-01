package io.tdd.kata;

import java.math.BigInteger;

public class FizzBuzz {

    public static final int COL_WIDTH = 14;
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    private final IterableFactory iterableFactory;

    public FizzBuzz(IterableFactory iterableFactory) {
        this.iterableFactory = iterableFactory;
    }

    public FizzBuzz() {
        this(new IntegerIterableFactory());
    }

    public String countTo(int n) {
        StringBuilder result = new StringBuilder();
        boolean isFirst = true;
        for (BigInteger i : iterableFactory.getIterable(n)) {
            if (!isFirst) {
                result.append(", ");
            }
            isFirst = false;
            result.append(numberToToken(i));
        }
        return wrapLine(result.toString(), COL_WIDTH);
    }

    protected String wrapLine(String str, int width) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i+=width) {
            boolean isLastLine = i + width >= str.length();
            if (isLastLine) {
                builder.append(str, i, str.length());
            } else {
                builder.append(str, i, i+width);
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    protected String numberToToken(BigInteger i) {
        String number = String.valueOf(i);
        if (isDivedBy(i, 15)) {
            number = FIZZ_BUZZ;
        } else if (isDivedBy(i, 3)) {
            number = FIZZ;
        } else if (isDivedBy(i, 5)) {
            number = BUZZ;
        }
        return number;
    }

    private boolean isDivedBy(BigInteger i, int i2) {
        return i.remainder(BigInteger.valueOf(i2)).equals(BigInteger.ZERO);
    }
}
