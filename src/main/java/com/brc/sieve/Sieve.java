package com.brc.sieve;

import java.util.ArrayList;
import java.util.Scanner;

public class Sieve {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean[] prime = new boolean[2];
    private static ArrayList<Integer> primes = new ArrayList<>();
    private static int limit;

    public static void sieve(int limit) {
        for (int i = 2; i < Math.sqrt(limit); i++) {
            if (prime[i]) {
                for (int j = i; j < limit; j++) {
                    if (j % i == 0) {
                        prime[j] = false;
                    }
                }
            }
        }
    }

    private static void initializePrimes(int length) {
        prime = new boolean[length];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
    }

    private static void printPrimes() {
        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                primes.add(i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(prime[0]);
        limit = scanner.nextInt();
        initializePrimes(limit);
        sieve(limit);
        printPrimes();
    }

}
