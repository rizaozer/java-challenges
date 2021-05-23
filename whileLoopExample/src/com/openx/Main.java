package com.openx;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        System.out.println(i);
        input.close();
    }
}



