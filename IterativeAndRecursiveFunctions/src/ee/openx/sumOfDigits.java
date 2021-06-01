package ee.openx;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumAllDigits_Iterative(123));
        System.out.println(sumAllDigits_Recursive(123));
    }

    public static int sumAllDigits_Iterative(int number) {
        int sum = 0;
        while(number > 9) {
            sum += number % 10;
            number = number / 10;
        }
        sum += number;
        return sum;
    }

    private static int sum = 0;
    public static int sumAllDigits_Recursive(int number) {
        if(number < 9) {
            sum += number;
        } else {
            sum += number % 10;
            sumAllDigits_Recursive(number / 10);
        }
        return sum;
    }
}
