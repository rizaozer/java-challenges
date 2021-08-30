package com.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLuckyNumber(3, 7));
    }

    public static int getLuckyNumber(int start, int end) {
        int counter = 0;
        for (int i = start; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j < end; j++) {
                if(i / j == 0 && i != j) {
                    flag = false;
                }
            }
            if(flag) {
                counter++;
            }
        }
        return counter;
    }
}
