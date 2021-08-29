package com.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(atbash("Riza"));
    }

    public static StringBuilder atbash(String text) {
        StringBuilder convertedText = new StringBuilder();
        char [] inputChars = text.toCharArray();
        for(char inputChar : inputChars) {
            if(Character.isLetter(inputChar)) {
                int temp = 'z' - inputChar;
                if(Character.isUpperCase(inputChar)) {
                    convertedText.append(Character.toUpperCase((char) ('A' + temp)));
                } else {
                    convertedText.append((char) ('a' + temp));
                }
            } else {
                convertedText.append(inputChar);
            }
        }
        return convertedText;
    }
}
