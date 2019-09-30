package io.tdd.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private String countTo(int n) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        return fizzBuzz.countTo(n);
    }

    private String toToken(int i) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        return fizzBuzz.numberToToken(i);
    }

    @Test
    public void should_return_1_for_1() {
        assertEquals("1", countTo(1));
    }

    @Test
    public void should_return_1_2_for_2() {
        assertEquals("1, 2", countTo(2));
    }

    @Test
    public void should_return_1_2_Fizz_for_3() {
        assertEquals("1, 2, Fizz", countTo(3));
    }

    @Test
    public void should_transfer_3_to_Fizz() {
        assertEquals("Fizz", toToken(3));
    }

    @Test
    public void should_transfer_10_to_Buzz() {
        assertEquals("Buzz", toToken(10));
    }

    @Test
    public void should_transfer_15_to_FizzBuzz() {
        assertEquals("FizzBuzz", toToken(15));
    }

    @Test
    public void should_format_add_linebreak_at_14_column() {
        assertEquals("1, 2, Fizz, 4,\n Buzz", countTo(5));
    }
}
