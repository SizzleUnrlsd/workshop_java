package com.github.szzlunrlsd.workshopjave;

public class FizzBuzz {
    public static void main(String[] args) {
        int i = 1;
        while (i != 200) {
            //System.out.println("Hello world!");
            if ((i % 5 != 0) && (i % 3 != 0))
                System.out.printf("%d\n", i);
            if (i % 3 == 0)
                System.out.printf("%d -> Fizz\n", i);
            if (i % 5 == 0)
                System.out.printf("%d -> Buzz\n", i);
            if ((i % 5 == 0) && (i % 3 == 0))
                System.out.printf("%d -> FizzBuzz\n", i);
            i++;
        }
    }
}
