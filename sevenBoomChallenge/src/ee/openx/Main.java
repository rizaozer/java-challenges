package ee.openx;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {5, 8, 2, 4, 6, 4775, 5, 2, 7, 5, 1};
        isSevenContains(numbers);
    }

    public static void isSevenContains(int[] array) {
        if (Arrays.toString(array).contains("7")) {
            System.out.println("BOOM!");
        } else {
            System.out.println("There is no 7 in the array");
        }
    }
}
