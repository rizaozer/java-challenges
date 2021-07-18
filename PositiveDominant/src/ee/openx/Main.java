package ee.openx;

public class Main {

    public static void main(String[] args) {
	    int [] numbers = {5, 99, 832, -3, -4};
        System.out.println(isPositiveDominant(numbers));
    }

    public static boolean isPositiveDominant(int [] numbers) {
        selectionSort(numbers);
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > 0 && numbers[i] != numbers[i + 1]) {
                countPositive++;
            }
            if(numbers[i] < 0 && numbers[i] != numbers[i + 1]) {
                countNegative++;
            }
        }
        if(numbers[numbers.length - 1] < 0 && numbers[numbers.length - 1] != numbers[numbers.length - 2]) {
            countNegative++;
        }
        if(numbers[numbers.length - 1] > 0 && numbers[numbers.length - 1] != numbers[numbers.length - 2]) {
            countPositive++;
        }
        return countPositive > countNegative;
    }

    public static int [] selectionSort(int [] numbersArray) {
        int n = numbersArray.length;
        for (int i = 0; i < n-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (numbersArray[j] > numbersArray[minIndex])
                    minIndex = j;
            int temp = numbersArray[minIndex];
            numbersArray[minIndex] = numbersArray[i];
            numbersArray[i] = temp;
        }
        return numbersArray;
    }
}
