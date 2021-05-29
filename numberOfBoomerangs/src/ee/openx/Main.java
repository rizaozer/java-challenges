package ee.openx;

public class Main {

    public static void main(String[] args) {
        int[] numbersArray = {3, 7, 3, 1, -1, 1, 5, 6, 5};

        System.out.println(countBomeranges(numbersArray));
    }

    private static int countBomeranges(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length - 2; i++) {
            if(array[i] == array[i + 2] && array[i] != array[i + 1]) {
                counter++;
            }
        }
        return counter;
    }
}
