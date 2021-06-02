package ee.openx;

public class Main {

    public static void main(String[] args) {
        int [] numbersArray = {1, 3, 8, 16, 22, 28, 37, 55, 62, 78, 91};
        System.out.println(binarySearchWithoutRecursion(numbersArray, numbersArray.length, 78));
        System.out.println(binarySearchWithRecursion(numbersArray, 0, numbersArray.length, 78));
    }

    public static int binarySearchWithoutRecursion(int[] array, int size, int value) {
        int first = 0; int last = size - 1; int middle;
        while(true) {
            middle = (first + last) / 2;
            if(array[middle] == value) {
                return middle;
            } else if(first >= last) {
                return - 1;
            } else if (value < array[middle]) {
                last = (middle - 1);
            } else {
                first = (middle + 1);
            }
        }
    }

    public static int binarySearchWithRecursion(int [] array, int first, int last, int value) {
        int middle = (first + last) / 2;
        if(array[middle] == value) {
            return middle;
        } else if(first >= last) {
            return - 1;
        } else if(value < array[middle]) {
            return binarySearchWithRecursion(array, first, middle - 1, value);
        } else {
            return binarySearchWithRecursion(array, middle + 1, last, value);
        }
    }
}




















