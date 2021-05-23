package ee.openx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input sentence: ");
        String text = scanner.nextLine();
        reverseTheContent(text);
    }

    public static void reverseTheContent(String sentence) {
        String [] stringArray = sentence.split(" ");
        System.out.print("Reverse sentence: ");
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i] + " ");
        }
    }
}
