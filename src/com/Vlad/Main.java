package com.Vlad;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum is " + sumOdd(1, 100));
        System.out.println("Booyakasha");

    }

    public static boolean isOdd(int number){
        if (number < 0 ) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0 || end < 0){
            return -1;
        }
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (isOdd(i)) {
                sum += i;
                System.out.println(sum);
            } else {
                System.out.println(" not odd "+i);
            }
        }
        return sum;
    }
}
