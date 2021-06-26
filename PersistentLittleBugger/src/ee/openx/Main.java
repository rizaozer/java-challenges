package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(bugger(25));
    }

    public static int bugger(int number) {
        int multiplicative = 1;
        int counter = 0;
        while(number >= 10) {
            counter++;
            while (number > 9) {
                multiplicative *= number % 10;
                number = number / 10;
            }
            multiplicative *= number;
            number = multiplicative;
        }
        return counter;
    }
}
