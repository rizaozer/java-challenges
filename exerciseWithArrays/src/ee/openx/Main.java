package ee.openx;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] nums = {20, 2, 33, 1996, -5, 87, 566, 6};
	    printArray(nums);
        System.out.println("Minimum value: " + findMinValue(nums));
        System.out.println("Maximum value: " + findMaxValue(nums));
        System.out.println("Average value: " + findAverage(nums));
        System.out.println("Selection Sort smaller to greater: ");
        System.out.println(Arrays.toString(selectionSort(nums)));
        int [] numsArray = {20, 2, 33, 1996, -5, 87, 566, 6};
        System.out.println("Buble Sort greater to smaller: ");
        System.out.println(Arrays.toString(bubleSort(numsArray)));
        System.out.println("Reverse array: ");
        System.out.println(Arrays.toString(reverseArray(numsArray)));

    }

    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". value: " + array[i]);
        }
    }

    public static int findMinValue(int [] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int findMaxValue(int [] array) {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int findAverage(int [] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }


    // int [] nums = {20, 2, 33, 1996, -5, 87, 566, 6};
    public static int[] selectionSort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            int tempMin = array[i];
            for (int j = 0; j < array.length; j++) {
                if(tempMin < array[j]) {
                    int temp = array[j];
                    array[j] = tempMin;
                    tempMin = temp;
                }
                array[i] = tempMin;
            }
        }
        return array;
    }

    public static int[] bubleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] reverseArray(int [] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }




}
