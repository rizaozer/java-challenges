package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(countVowels("Apparently, a heart that beats for no one, but for Tesh."));
    }

    public static int countVowels(String text) {
        int counter = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'a') {
                counter += 4;
            }
            if(text.charAt(i) == 'e') {
                counter += 3;
            }
            if(text.charAt(i) == 'i') {
                counter += 1;
            }
        }
        return counter;
    }
}
