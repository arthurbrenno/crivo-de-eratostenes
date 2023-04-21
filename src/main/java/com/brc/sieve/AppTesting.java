package com.brc.sieve;

public class AppTesting {
    private static Sieve sieve = new Sieve();

    public static void main(String[] args) {
        sieve.calculate(10);
        System.out.println(sieve.getList());
    }
}
