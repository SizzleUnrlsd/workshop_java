package com.github.szzlunrlsd.workshopjave;
import java.util.Random;
import java.util.Scanner;
public class GuessANumber {
    public static void main(String[] args) {
        int i = 0;
        Random random = new Random();
        int min = 0;
        int max = 100;
        int number = random.nextInt(min, max);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("Your guess? " + x);
            if (x < number)
                System.out.printf("Too low!\n");
            if (x > number)
                System.out.printf("Too high!\n");
            System.out.print("Your guess? ");
            if (x == number) {
                System.out.printf("It took you %d tries.\n", i);
                break;
            }
            i++;
        }
    }
}
