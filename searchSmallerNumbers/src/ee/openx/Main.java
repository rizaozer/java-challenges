package ee.openx;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] firstArray = {1, 5, 8, 7, 2, 12, 55, 17, 22, 19};
        int [] secondArray = {3, 6, 13};
        ArrayList < Integer > result = searchSmallerNumbers(firstArray, secondArray);
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Number of elements less than " + secondArray[i]+ ": " + result.get(i));
        }
    }
    
    public static ArrayList< Integer > searchSmallerNumbers(int[] firstArray, int[] secondArray) {
        ArrayList <Integer> result = new ArrayList<>();
        Arrays.sort(firstArray);
        for (int i = 0; i < secondArray.length; i++) {
            result.add(temp(firstArray, secondArray[i]));
        }
        return result;
    }

    private static int temp(int[] firstArray, int number) {
        int counter = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] < number) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }
}
