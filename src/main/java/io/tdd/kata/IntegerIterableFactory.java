package io.tdd.kata;

import java.math.BigInteger;
import java.util.Iterator;

public class IntegerIterableFactory implements IterableFactory {

    @Override
    public Iterable<BigInteger> getIterable(int n) {
        return () -> new Iterator<BigInteger>() {
            int i = 1;
            @Override
            public boolean hasNext() {
                return i <= n;
            }

            @Override
            public BigInteger next() {
                return BigInteger.valueOf(i++);
            }
        };
    }
}