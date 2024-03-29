package com.javarush.task.task28.task2805;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.print(new MyThread().getPriority() + " ");
        }
        //Output
        //1 2 3 4 5 6 7 8 9 10 11 12

        System.out.println();
        ThreadGroup group = new ThreadGroup("someName");
        group.setMaxPriority(7);
        for (int i = 0; i < 12; i++) {
            System.out.print(new MyThread(group, "name" + i).getPriority() + " ");
        }
        //Output
        //3 4 5 6 7 7 7 7 2 3 4
    }
}
