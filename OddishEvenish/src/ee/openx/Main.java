package ee.openx;

public class Main {

    public static void main(String[] args) {
        oddishOrEvenish(43);
    }

    private static void oddishOrEvenish(int number) {
        int sum = 0;
        while (number > 9) {
            sum += number % 10;
            number = number / 10;
        }
        sum += number;
        if(sum % 2 == 0) {
            System.out.println("Evenish");
        } else {
            System.out.println("Oddish");
        }
    }
}





