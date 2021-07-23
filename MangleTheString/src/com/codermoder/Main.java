package com.codermoder;

public class Main {

    public static void main(String[] args) {
        System.out.println(mangle("The quick brown fox.")); //  ➞ "UIf rvjdl cspxO gpy."
    }

    public static String mangle(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(Character.isLetter(stringBuilder.charAt(i))) {
                int temp = stringBuilder.charAt(i) + 1;
                char tempChar = (char) temp;
                stringBuilder.setCharAt(i, tempChar);
            }
        }
        return stringBuilder.toString();
    }
}
