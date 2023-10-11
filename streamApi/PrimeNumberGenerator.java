
package streamApi;

import java.util.stream.IntStream;

public class PrimeNumberGenerator {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start = 2;
        int end = 100;

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        IntStream.rangeClosed(start, end)
                .filter(PrimeNumberGenerator::isPrime)
                .forEach(System.out::println);
    }
}
