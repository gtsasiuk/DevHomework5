package org.example;

import java.util.HashMap;
import java.util.Map;

public class NumberFibonacci {
    private static Map<Integer, Long> fibonacciMemo = new HashMap<>();

    // часова складність - O(n); просторова складність - O(1);
    public long calculateByIteration(int n) {
        if (n <= 1) {
            return n;
        }
        long n1 = 0, n2 = 1;
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }

    // часова складність - O(2^n); просторова складність - O(n);
    public long calculateByRecursion(int n) {
        if (n <= 1) {
            return n;
        }

        return calculateByRecursion(n - 1) + calculateByRecursion(n - 2);
    }

    // часова складність - O(n); просторова складність - O(n);
    public long calculateByDP(int n) {
        if (n <= 1) {
            return n;
        }

        fibonacciMemo.put(0, 0L);
        fibonacciMemo.put(1, 1L);

        for (int i = 2; i <= n; i++) {
            long result = fibonacciMemo.get(i - 1) + fibonacciMemo.get(i - 2);
            fibonacciMemo.put(i, result);
        }

        return fibonacciMemo.get(n);
    }
}
