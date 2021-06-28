package ee.openx;

public class Main {

    public static void main(String[] args) {
	    int [] myNumbers = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}; // - > Largest gap between 7 and 11 is 4
        System.out.println(largestGap(myNumbers));
    }

    public static int largestGap(int [] numbersArray) {
        int [] sortedArray = bubleSort(numbersArray);
        int maxGap = 0;
        for (int i = 0; i < numbersArray.length - 1; i++) {
            if((sortedArray[i + 1] - sortedArray[i]) > maxGap) {
                maxGap = (sortedArray[i + 1] - sortedArray[i]);
            }
        }
        return maxGap;
    }

    public static int [] bubleSort(int [] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray.length - 1; j++) {
                if(numbersArray[j] > numbersArray[j + 1]) {
                    int temp = numbersArray[j + 1];
                    numbersArray[j + 1] = numbersArray[j];
                    numbersArray[j] = temp;
                }
            }
        }
        return numbersArray;
    }
}
