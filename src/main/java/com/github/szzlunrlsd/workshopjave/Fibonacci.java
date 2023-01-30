package com.github.szzlunrlsd.workshopjave;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0;
        int t2 = 1;
        System.out.printf("Suite de Fibonacci de %d\n", n);
        for (int i = 1; i <= n; ++i) {
            if (i == n) {
                System.out.printf("Recursive: %d\n", t2);
                System.out.printf("Iterative: %d\n", t2);
            }
            //System.out.printf("Recursive: %d", t2);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
