package ee.openx;

public class Main {
    private static int counter = 0;

    public static void main(String args[]) {
        System.out.println(towerOfHanoi(3));
    }

    private static int towerOfHanoi(int n) {
        if (n == 1) {
            counter++;
        } else {
            towerOfHanoi(n - 1);
            counter++;
            towerOfHanoi(n - 1);
        }
        return counter;
    }
}