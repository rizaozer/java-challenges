package ee.openx;


public class Main {

    public static void main(String[] args) {
        char [] myChars = {'a', 'b', 'c', 'e', 'f', 'g'};
        System.out.println(missingLetter(myChars));
    }

    public static char missingLetter(char [] charArray) {
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i + 1] - charArray[i] != 1) {
                int c = charArray[i] + 1;
                char missingChar = (char) c;
                return missingChar;
            }
        }
        return 0;
    }




}
