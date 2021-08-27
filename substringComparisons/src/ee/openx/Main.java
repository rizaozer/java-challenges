package ee.openx;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        getSmallestAndLargest("welcometojava", 3);
    }

    public static String getSmallestAndLargest(String s, int k) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> stringsMax = new ArrayList<>();
        ArrayList<String> stringsMin = new ArrayList<>();
        String smallest = "";
        String largest = "";

        for (int i = 0; i < s.length() - k + 1; i++) {
            strings.add(s.substring(i, k + i));
        }

        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < strings.size(); i++) {
            sum = 0;
            for (int j = 0; j < strings.get(i).length(); j++) {
                sum += strings.get(i).charAt(j);
            }
            if(sum > max) {
                max = sum;
                stringsMax.add(strings.get(i));
            }
            if(sum < min) {
                min = sum;
                stringsMin.add(strings.get(i));
            }
        }

        System.out.println("Min: " + stringsMin.get(stringsMin.size() - 1) + " " + min);
        System.out.println("Max: " + stringsMax.get(stringsMax.size() - 1) + " " + max);

        return smallest + "\n" + largest;
    }
}