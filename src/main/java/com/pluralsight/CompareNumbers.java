package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isPositive(5));

    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
//        if (number % 2 == 0) {
//            return true;
//        }
//        else {
//            return false;
//        }
    }

    public static boolean isPositive(double number) {
        return (number > 0);
//        if (number > 0) {
//            return true;
//        }
//        else {
//            return false;
//        }
    }
}
