package ee.openx;

public class Main {

    public static void main(String[] args) {
        int [] numbersArray = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}; // - > 5
        System.out.println(findOdd(numbersArray));
    }

    public static int findOdd(int [] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < numbersArray.length; j++) {
                if(numbersArray[i] == numbersArray[j]) {
                    counter++;
                }
            }
            if(counter % 2 != 0) {
                return numbersArray[i];
            }
        }
        return 0;
    }
}
