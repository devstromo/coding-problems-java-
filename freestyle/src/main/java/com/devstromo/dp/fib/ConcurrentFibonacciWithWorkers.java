package com.devstromo.dp.fib;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentFibonacciWithWorkers {

    private final Map<Integer, Long> memo = new HashMap<>();

    private final Object lock = new Object();

    public ConcurrentFibonacciWithWorkers() {
        memo.put(0, 0L);
        memo.put(1, 1L);
    }

    public long fib(int n) {
        // Check if the value is already calculated
        synchronized (lock) {
            if (memo.containsKey(n)) {
                return memo.get(n);
            }
        }

        FibonacciWorker worker1 = new FibonacciWorker(n - 1);
        FibonacciWorker worker2 = new FibonacciWorker(n - 2);

        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);

        thread1.start();
        thread2.start();

        try {
            // Wait for the workers to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long result = worker1.getResult() + worker2.getResult();

        synchronized (lock) {
            memo.put(n, result);
        }

        return result;
    }

    class FibonacciWorker implements Runnable {
        private final int n;
        private long result;

        public FibonacciWorker(int n) {
            this.n = n;
        }

        public long getResult() {
            return result;
        }

        @Override
        public void run() {
            result = fib(n);
        }
    }

    public static void main(String[] args) {
        ConcurrentFibonacciWithWorkers fibCalculator = new ConcurrentFibonacciWithWorkers();
        int n = 30;

        for (int i = 0; i <= n; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                long result = fibCalculator.fib(finalI);
                System.out.println("Fib(" + finalI + ") = " + result);
            });
            thread.start();
        }
    }
}
