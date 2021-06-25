package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(almostPalindrome("abcdcba")); // true
        System.out.println(almostPalindrome("1234312")); // false
        System.out.println(almostPalindrome("abccia")); // true
    }

    public static boolean almostPalindrome(String inputString) {
        int counter = 0;
        for (int i = 0; i < inputString.length() / 2; i++) {
           if(!(inputString.charAt(i) == inputString.charAt(inputString.length() - 1 - i))) {
               counter++;
           }
           if(counter > 1) {
               return false;
           }
        }
        return true;
    }
}
