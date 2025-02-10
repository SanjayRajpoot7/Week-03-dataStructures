package ProblemStatement;

public class RecursiveVsIterativeFibonacciComputation {

        // Recursive Fibonacci (Exponential Time Complexity: O(2^N))
        public static int fibonacciRecursive(int n) {
            if (n <= 1) return n;
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }

        // Iterative Fibonacci (Linear Time Complexity: O(N))
        public static int fibonacciIterative(int n) {
            if (n <= 1) return n;

            int a = 0, b = 1, sum = 0;
            for (int i = 2; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            return b;
        }

        public static void main(String[] args) {
//            int n = 30;  // Change this value to test different Fibonacci numbers
            RecursiveVsIterativeFibonacciComputation rif = new RecursiveVsIterativeFibonacciComputation();
            long startTime, endTime;
            double result;

            // Measure time for Recursive Fibonacci
            startTime = System.nanoTime();
            rif.fibonacciRecursive(10);
            endTime = System.nanoTime();
            result = (endTime - startTime) / 1_000_000; // Convert to milliseconds
            System.out.println("Time taken (Recursive): " + result + " ms");

            // Measure time for Iterative Fibonacci
            startTime = System.nanoTime();
            rif.fibonacciIterative(10);
            endTime = System.nanoTime();
           result = (endTime - startTime) / 1_000_000; // Convert to millisecond
            System.out.println("Time taken (Iterative): " + result + " ms");


            startTime = System.nanoTime();
            rif.fibonacciRecursive(30);
            endTime = System.nanoTime();
            result = (endTime - startTime) / 1_000_000; // Convert to milliseconds
            System.out.println("Time taken (Recursive): " + result + " ms");

            // Measure time for Iterative Fibonacci
            startTime = System.nanoTime();
            rif.fibonacciIterative(30);
            endTime = System.nanoTime();
            result = (endTime - startTime) / 1_000_000; // Convert to millisecond
            System.out.println("Time taken (Iterative): " + result + " ms");
        }

}
