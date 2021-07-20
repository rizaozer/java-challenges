package ee.openx;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(periodic("3061")); // -> 7
    }

    public static int periodic(String number) {
        ArrayList<String> numbersList = new ArrayList();
        int counter = 1;
        while (true) {
            String sumOfMyDigits = Integer.toString(sumOfDigits(Integer.parseInt(number)));
            number = number + sumOfMyDigits;
            number = number.substring(sumOfMyDigits.length());
            if(numbersList.contains(number)) {
                break;
            }
            numbersList.add(number);
            counter++;

        }

        return counter;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while(number > 9) {
            sum = sum + number % 10;
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
