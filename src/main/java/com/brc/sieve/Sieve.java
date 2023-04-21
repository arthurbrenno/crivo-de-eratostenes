package com.brc.sieve;

import java.util.ArrayList;
import java.util.Scanner;

public class Sieve {
    private boolean[] notPrime;
    private ArrayList<Integer> primeList = new ArrayList<>();

    public void calculate(int limit) {
        notPrime = new boolean[limit];
        for (int i = 2; i < Math.sqrt(limit); i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j < limit; j += i) {
                    if (j % i == 0) {
                        notPrime[j] = true;
                    }
                }
            }
        }
    }

    public String getList() {
        for (int i = 2; i < notPrime.length; i++) {
            if (!notPrime[i]) {
                primeList.add(i);
            }
        }
        return primeList.toString();
    }

}
