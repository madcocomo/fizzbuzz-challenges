package io.tdd.kata;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciIterableFactory implements IterableFactory {
    @Override
    public Iterable<BigInteger> getIterable(int n) {
        return () -> new Iterator<BigInteger>() {
            int i = 0;
            BigInteger last = BigInteger.ONE;
            BigInteger secondLast = BigInteger.ONE;
            @Override
            public boolean hasNext() {
                return i < n;
            }

            @Override
            public BigInteger next() {
                i++;
                if (i < 3) {
                    return BigInteger.ONE;
                }
                BigInteger result = last.add(secondLast);
                secondLast = last;
                last = result;
                return result;
            }
        };
    }
}
