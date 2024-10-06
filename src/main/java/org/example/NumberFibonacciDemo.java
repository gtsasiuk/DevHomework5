package org.example;

public class NumberFibonacciDemo {
    public static void main(String[] args) {
        NumberFibonacci fib = new NumberFibonacci();
        System.out.println("Fibonacci by iteration: " + fib.calculateByIteration(8));
        System.out.println("Fibonacci by recursion: " + fib.calculateByRecursion(6));
        System.out.println("Fibonacci by dynamic programing: " + fib.calculateByDP(10));
    }
}
