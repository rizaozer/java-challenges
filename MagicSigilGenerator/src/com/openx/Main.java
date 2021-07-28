package com.openx;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(sigilize("i am healthy"));
    }

    public static String sigilize(String text) {
        text = text.toUpperCase();
        text = removeVowels(text);
        char [] textToChars = text.toCharArray();
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if(textToChars[i] == textToChars[j]) {
                    break;
                }
            }
            if(i == j) {
                textToChars[index++] = textToChars[i];
            }
        }
        char [] uniqueChars = Arrays.copyOf(textToChars, index);
        return Arrays.toString(uniqueChars).replaceAll(", ", "");
    }

    public static String removeVowels(final String string){
        String vowels = "AaEeIiOoUu ";
        StringBuilder builder = new StringBuilder();
        for(char c : string.toCharArray()) {
            if (vowels.indexOf(c) < 0) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
