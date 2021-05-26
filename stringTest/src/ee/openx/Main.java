package ee.openx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Input first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Input second string: ");
        String secondString = scanner.nextLine();
        System.out.println("If the second string contains the first one?");
        System.out.println(isContainsString(firstString, secondString));
    }
    
    public static boolean isContainsString(String firstString, String secondString) {
        boolean ans = false;
        for (int i = 0; i < secondString.length(); i++) {
            if(secondString.charAt(i) == firstString.charAt(0)) {
                for (int j = 0; j < firstString.length() ; j++) {
                    if ((i + j) < secondString.length() && firstString.charAt(j) == secondString.charAt(i + j) &&
                            j == firstString.length() - 1) {
                        ans = true;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
