package ee.openx;

public class IsContains6 {
    public static void main(String[] args) {
        // 1. Given an array of ints, compute if the array contains a 6.

        int [] array1 = {1, 6, 4, 0};
        int [] array2 = {1, 4, 0};
        int [] array3 = {6, 0};

        System.out.println(IsContains6_Iterate(array1));
        System.out.println(IsContains6_Iterate(array2));
        System.out.println(IsContains6_Iterate(array3));

        System.out.println();

        System.out.println(IsContains6_Recursive(array1,6, 0));
        System.out.println(IsContains6_Recursive(array2,6, 0));
        System.out.println(IsContains6_Recursive(array3,6, 0));
    }

    public static boolean IsContains6_Iterate(int[] numbersArray) {
        for (int j : numbersArray) {
            if (j == 6) {
                return true;
            }
        }
        return false;
    }

    public static boolean IsContains6_Recursive(int[] numbersArray, int number, int index) {
        if (index < numbersArray.length) {
            if (numbersArray[index] == 6) {
                return true;
            } else {
                return IsContains6_Recursive(numbersArray, number, index + 1);
            }
        }
        return false;
    }
}
