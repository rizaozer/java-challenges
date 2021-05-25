package ee.openx;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] numbersArray = {2, 1, 12, 5, 100, -1, 50, 20, -2, 15};
        System.out.println("Original Array: " + Arrays.toString(numbersArray));
        System.out.println("Sorted Array: " + Arrays.toString(selectionSort(numbersArray)));
    }

    public static int[] selectionSort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    swap(array, i, j);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
