package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(selectLetters("heLLO", "GUlp")); // -> help
    }

    public static String selectLetters(String text1, String text2) {
        String myText = "";
        for (int i = 0; i < text2.length(); i++) {
            if(i >= text1.length())
                break;
            if(Character.isUpperCase(text2.charAt(i))) 
                myText = myText + text1.charAt(i);
        }

        for (int i = 0; i < text1.length(); i++) {
            if(i >= text2.length())
                break;
            if(Character.isUpperCase(text1.charAt(i)))
                myText = myText + text2.charAt(i);
        }
        return myText;
    }
}
