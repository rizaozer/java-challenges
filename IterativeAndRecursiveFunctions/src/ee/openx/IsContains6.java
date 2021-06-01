package ee.openx;

public class IsContains6 {
    public static void main(String[] args) {
        // 1. Given an array of ints, compute if the array contains a 6.
//        array6([1, 6, 4], 0) → true
//        array6([1, 4], 0) → false
//        array6([6], 0) → true

        int [] array1 = {1, 6, 4, 0};
        int [] array2 = {1, 4, 0};
        int [] array3 = {6, 0};

        System.out.println(IsContains6_First(array1));
        System.out.println(IsContains6_First(array2));
        System.out.println(IsContains6_First(array3));

        System.out.println();

        System.out.println(IsContains6_Second(array1,6, 0));
        System.out.println(IsContains6_Second(array2,6, 0));
        System.out.println(IsContains6_Second(array3,6, 0));
    }

    public static boolean IsContains6_First(int[] numbersArray) {
        for (int j : numbersArray) {
            if (j == 6) {
                return true;
            }
        }
        return false;
    }

    public static boolean IsContains6_Second(int[] numbersArray, int number, int index) {
        if (index < numbersArray.length) {
            if (numbersArray[index] == 6) {
                return true;
            } else {
                return IsContains6_Second(numbersArray, number, index + 1);
            }
        }
        return false;
    }
}
