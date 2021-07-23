package com.codermoder;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeWord("One two three four", "two"));
    }

    public static String removeWord(String inputText, String removedText) {
        StringBuilder stringBuffer = new StringBuilder(inputText);
        int index = stringBuffer.indexOf(removedText);
        if (index != -1) {
            stringBuffer.delete(index, index + removedText.length());
        }
        return stringBuffer.toString();
    }
}
