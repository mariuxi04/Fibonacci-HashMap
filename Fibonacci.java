import java.util.HashMap;
import java.util.Map;


public class Fibonacci {
    static Map<Integer, Long> fibonacciCache = new HashMap<>();

    public static long calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache.containsKey(n)) {
            return fibonacciCache.get(n);
        }

        long fibValue = calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        fibonacciCache.put(n, fibValue);

        return fibValue;
    }

    public static void mostrarSerieFibonacci() {
        System.out.print("Serie Fibonacci: ");
        for (int i = 0; i <= fibonacciCache.size(); i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        System.out.println();
    }
}