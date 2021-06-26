package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(unmix("hTsii  s aimex dpus rtni.g"));
    }

    public static String unmix(String myString) {
        StringBuilder swapedString = new StringBuilder();
        for (int i = 0; i < myString.length() - 1; i+=2) {
            swapedString.append(myString.charAt(i + 1));
            swapedString.append(myString.charAt(i));
        }
        return swapedString.toString();
    }
}
