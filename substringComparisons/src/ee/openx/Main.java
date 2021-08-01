package ee.openx;

public class Main {

    public static void main(String[] args) {
        getSmallestAndLargest("getSmallestAndLargest", 3);
        String s = "getSmallestAndLargest";
        System.out.println(s.substring(0,3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        for (int i = 0; i < s.length(); i++) {
            s.substring(i, k);
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}