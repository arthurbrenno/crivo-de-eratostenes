package com.brc.sieve;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class Sieve {
    private BitSet notPrime;
    private ArrayList<Integer> primeList = new ArrayList<>();
    public void calculate(int limit) {
        notPrime = new BitSet(limit + 1);
        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (!notPrime.get(i)) {
                for (int j = i * i; j <= limit; j += i) {
                    notPrime.set(j);
                }
            }
        }
    }

    public String getList() {
        primeList.clear();
        for (int i = 2; i < notPrime.length(); i++) {
            if (!notPrime.get(i)) {
                primeList.add(i);
            }
        }
        return primeList.toString();
    }

}
