package ee.openx;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String text = "I just!!! can!!! not!!! believe!!! it!!!";
        noYelling1(text);
        noYelling2(text);
    }

    // Soulution 1
    public static void noYelling1(String text) {
        char[] myTextChars = text.toCharArray();
        ArrayList<String> charsList = new ArrayList<>();
        for (char myTextChar : myTextChars) {
            charsList.add(Character.toString(myTextChar));
        }
        for (int i = charsList.size() - 1; i > 0; i--) {
            if(charsList.get(i - 1).equals("!") || charsList.get(i - 1).equals("?")) {
                if (charsList.get(i).equals("!")) {
                    charsList.remove(i);
                } else if (charsList.get(i).equals("?")) {
                    charsList.remove(i);
                }
            } else {
                break;
            }
        }
        for (String s : charsList) {
            System.out.print(s);
        }
        System.out.println();
    }

    // Soulution 2
    public static void noYelling2(String text) {
        int count = 0;
        for (int i = text.length() - 1; i > 0; i--) {
            if(text.charAt(i) == '!' && text.charAt(i - 1) == '!' ||
                    text.charAt(i) == '?' && text.charAt(i - 1) == '?') {
                count++;
            } else {
                break;
            }
        }
        text = text.substring(0, text.length() - count);
        System.out.println(text);
    }
}
