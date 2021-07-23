package com.codermoder;

public class Main {

    public static void main(String[] args) {
        System.out.println(waysToClimb(5));
    }

    public static int waysToClimb(int numberOfStairs) {
        if(numberOfStairs == 0 || numberOfStairs == 1) {
            return 1;
        }
        return waysToClimb(numberOfStairs - 2) + waysToClimb(numberOfStairs - 1);
    }
}