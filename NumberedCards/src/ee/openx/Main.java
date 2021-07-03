package ee.openx;

public class Main {

    public static void main(String[] args) {
        int [] firstPlayer = {2, 5, 2, 6, 9};
        int [] secondPlayer = {3, 7, 3, 1, 2};
        System.out.println(winRound(firstPlayer, secondPlayer));
    }

    public static boolean winRound(int [] firstPlayer, int [] secondPlayer) {
        bubleSort(firstPlayer);
        bubleSort(secondPlayer);
        return firstPlayer[0] * 10 + firstPlayer[1] > secondPlayer[0] * 10 + secondPlayer[1];
    }

    public static int[] bubleSort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j + 1] > array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
