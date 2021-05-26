package ee.openx;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] numbersArray = {7, 2, 17, 4, 1, 22, 99, 3, 5, 6, 8, 2, 10};
        System.out.println(Arrays.toString(sortEvenAndOddNumbers(numbersArray)));
    }

    public static int[] sortEvenAndOddNumbers(int [] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if ((array[i + 1] % 2) == 0 && (array[i] % 2 != 0)) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp;
        temp = array[secondIndex];
        array[secondIndex] = array[firstIndex];
        array[firstIndex] = temp;
    }
}
