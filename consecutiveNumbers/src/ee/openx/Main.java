package ee.openx;

public class Main {

    public static void main(String[] args) {
        int [] array = {5, 1, 4, 3, 6, 2, 7};
        System.out.println(isConsecutive(array));
    }

    public static int [] bubleSort(int [] array) {
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

    public static boolean isConsecutive(int [] array) {
        bubleSort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i + 1] - array[i] != 1) {
                return false;
            }
        }
        return true;
    }
}
