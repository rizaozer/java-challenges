package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isDisarium(135));
    }

    public static boolean isDisarium(int number) {
        int fakeNumber1 = number;
        int fakeNumber2 = number;
        int sum = 0;
        // count digits
        int countDigit = 1;
        if(number == 0 || number < 0) {
            return false;
        }

        while(fakeNumber1 > 9) {
            fakeNumber1 = fakeNumber1 / 10;
            countDigit++;
        }

        while(fakeNumber2 > 0) {
            int temp = fakeNumber2 % 10;
            sum = sum + (int) Math.pow(temp, countDigit);
            countDigit--;
            fakeNumber2 = fakeNumber2 / 10;
        }
        System.out.println(sum);
        return sum == number;
    }
}
