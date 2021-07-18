package ee.openx;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(unrepated("teshahset"));
    }

    public static String unrepated(String myText) {
        char [] chars = myText.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Character character : charSet) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
