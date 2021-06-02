package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(countX("xHixHowxarexyoux"));
    }

    public static int countX(String text) {
        if(text.isEmpty()) {
            return 0;
        }
        if(text.substring(0,1).equals("x")) {
            return 1 + countX(text.substring(1));
        }
        return countX(text.substring(1));
    }
}
