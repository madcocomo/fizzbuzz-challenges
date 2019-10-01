package io.tdd.kata;

import java.math.BigInteger;

public interface IterableFactory {
    Iterable<BigInteger> getIterable(int n);
}
