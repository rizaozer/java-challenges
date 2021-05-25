package ee.openx;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] numbersArray = {2, 1, 12, 12, 100, -1, 50, 20, -2, 15};
        System.out.println("Original Array: " + Arrays.toString(numbersArray));
        System.out.println("Sorted Array: " + Arrays.toString(insertionSort(numbersArray)));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
        return array;
    }
}

