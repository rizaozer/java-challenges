package ee.openx;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] numbers = {515, 341, 98, 44, 211};
        System.out.println(Arrays.toString(reorderDigits(numbers, "asc")));
    }

    public static int [] reorderDigits(int [] numbers, String order) {
        if(order.equals("asc")) {
            ascendingSort(numbers);
            return numbers;
        } else if (order.equals("desc")) {
            descendingSort(numbers);
            return numbers;
        } else {
            System.out.println("Please enter valid ordering method 'asc' or 'desc'");
            return null;
        }
    }

    public static int [] descendingSort(int [] unSortedNumbers) {
        for (int j = 0; j < unSortedNumbers.length; j++) {
            int number = unSortedNumbers[j];
            int sorted = 0;
            int digits = 10;
            int sortedDigits = 1;
            boolean first = true;
            while (number > 0) {
                int digit = number % 10;
                if (!first) {
                    int tmp = sorted;
                    int toDivide = 1;
                    for (int i = 0; i < sortedDigits; i++) {
                        int tmpDigit = tmp % 10;
                        if (digit <= tmpDigit) {
                            sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                            break;
                        } else if (i == sortedDigits-1) {
                            sorted = digit * digits + sorted;
                        }
                        tmp /= 10;
                        toDivide *= 10;
                    }
                    digits *= 10;
                    sortedDigits += 1;
                } else {
                    sorted = digit;
                }
                first = false;
                number = number / 10;
            }
            unSortedNumbers[j] = sorted;
        }
        return unSortedNumbers;
    }

    public static int [] ascendingSort(int [] unSortedNumbers) {
        for (int j = 0; j < unSortedNumbers.length; j++) {
            int number = unSortedNumbers[j];
            int sorted = 0;
            int digits = 10;
            int sortedDigits = 1;
            boolean first = true;
            while (number > 0) {
                int digit = number % 10;
                if (!first) {
                    int tmp = sorted;
                    int toDivide = 1;
                    for (int i = 0; i < sortedDigits; i++) {
                        int tmpDigit = tmp % 10;
                        if (digit >= tmpDigit) {
                            sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                            break;
                        } else if (i == sortedDigits-1) {
                            sorted = digit * digits + sorted;
                        }
                        tmp /= 10;
                        toDivide *= 10;
                    }
                    digits *= 10;
                    sortedDigits += 1;
                } else {
                    sorted = digit;
                }
                first = false;
                number = number / 10;
            }
            unSortedNumbers[j] = sorted;
        }
        return unSortedNumbers;
    }
}
