package com.Vlad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a low range boundary: ");
        int start = scanner.nextInt();
        System.out.println("Enter an upper range boundary: ");
        int end = scanner.nextInt();
        int result = sumOdd(start, end);
        if (result > 0) {
            System.out.println("The sum of odd numbers in given range is " + sumOdd(start, end));
            System.out.println("Booyakasha!");
        } else {
            System.out.println("Invalid input");
        }

    }

    public static boolean isOdd(int number){
        if (number < 0 ) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0){
            return -1;
        }
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
