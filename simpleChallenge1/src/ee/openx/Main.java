package ee.openx;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Original array: [0, 3, 4, 0, 1, 2, 5, 0]
//        Result: [3, 4, 1, 2, 5, 0, 0, 0]
        int[] numbersArray = {0, 3, 4, 0, 1, 2, 5, 0};
        System.out.println(Arrays.toString(takeZeroToTheRight(numbersArray)));
    }

    public static int[] takeZeroToTheRight(int[] array) {
        boolean  quit = true;
        while(quit) {
            quit = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 0 && array[i + 1] != 0) {
                    swap(array, i, i+1);
                    quit = true;
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


}
