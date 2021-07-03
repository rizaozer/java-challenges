package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcadacezz")); // -> 3
        System.out.println(duplicateCount("Indivisibilities")); // -> 2
        System.out.println(duplicateCount("Aa")); // -> 0
    }

    public static int duplicateCount(String myText) {
        int counter = 0;
        for (int i = 0; i < myText.length(); i++) {
            char temp = myText.charAt(i);
            for (int j = i + 1; j < myText.length(); j++) {
                if (temp == myText.charAt(j)) {
                    counter++;
                    myText = myText.replaceAll(myText.substring(j, j + 1), "");
                    break;
                }
            }
        }
        return counter;
    }
}
