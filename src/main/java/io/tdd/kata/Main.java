package io.tdd.kata;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(new FibonacciIterableFactory());
        System.out.println(fizzBuzz.countTo(100));
    }
}
