package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(selectLetters("GUlp", "heLL"));
    }

    public static String selectLetters(String text1, String text2) {
        String text = "";
        for (int i = 0; i < text1.length(); i++) {
            if(Character.isUpperCase(text1.charAt(i))) {
                text = text + text2.charAt(i);
            }
        }

        for (int i = 0; i < text2.length(); i++) {
            if(Character.isUpperCase(text2.charAt(i))) {
                text = text + text1.charAt(i);
            }
        }
        return text;
    }
}
