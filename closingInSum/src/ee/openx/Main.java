package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(closingInSum("2255"));
    }

    public static int closingInSum(String stringNumber) {
        if(stringNumber.length()== 0) {
            return 0;
        }
        if(stringNumber.length() == 1) {
            return Integer.parseInt(stringNumber);
        } else {
            return Integer.parseInt(stringNumber.substring(0, 1) + stringNumber.substring(stringNumber.length() - 1)) +
                        closingInSum(stringNumber.substring(1, stringNumber.length() - 1));
        }
    }
}































