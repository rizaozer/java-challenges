package com.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(plusSign("+f+d+c+#+f+"));
    }

    public static boolean plusSign(String text) {
        boolean flag = true;
        for (int i = 0; i < text.length(); i+=2) {
            if(text.charAt(i) != '+') {
                flag = false;
            }
        }
        return flag;
    }
}
