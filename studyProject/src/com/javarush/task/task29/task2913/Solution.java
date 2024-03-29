package com.javarush.task.task29.task2913;

import java.util.Random;

public class Solution {
    private static int numberA;
    private static int numberB;

//    public static String recursion(int a, int b) {
//        if (a > b) {
//            return a + " " + recursion(a - 1, b);
//        } else {
//            if (a == b) {
//                return Integer.toString(a);
//            }
//            return a + " " + recursion(a + 1, b);
//        }
//    }

    public static String getAllNumbersBetween(int a, int b) {
        StringBuilder string = new StringBuilder();
        if (a > b) {
            while (a >= b) {
                string.append(a).append(" ");
                a--;
            }
        } else {
            while (a <= b) {
                string.append(a).append(" ");
                a++;
            }
        }

        return string.toString().trim();
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}
