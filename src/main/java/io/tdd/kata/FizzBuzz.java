package io.tdd.kata;

public class FizzBuzz {

    public static final int COL_WIDTH = 14;
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    private final IntegerIterableFactory iterableFactory;

    public FizzBuzz(IntegerIterableFactory iterableFactory) {
        this.iterableFactory = iterableFactory;
    }

    public FizzBuzz() {
        this(new IntegerIterableFactory());
    }

    public String countTo(int n) {
        StringBuilder result = new StringBuilder();
        for (int i : iterableFactory.getIterable(n)) {
            if (i > 1) {
                result.append(", ");
            }
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

    protected String numberToToken(int i) {
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

    private boolean isDivedBy(int i, int i2) {
        return i % i2 == 0;
    }
}
