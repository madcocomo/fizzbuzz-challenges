package io.tdd.kata;

import java.util.Iterator;

public class IntegerIterableFactory implements IterableFactory {

    protected Iterable<Integer> getIterable(int n) {
        return new Iterable<Integer>() {
            int i = 1;

            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    @Override
                    public boolean hasNext() {
                        return i <= n;
                    }

                    @Override
                    public Integer next() {
                        return i++;
                    }
                };
            }
        };
    }
}