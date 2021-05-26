package ee.openx;

public class Main {
    public static void main(String args[]) {
        int n = 5;
        towerOfHanoi(n,'A','C', 'B');
    }

    public static void towerOfHanoi(int n, char firstRod, char secondRod, char auxRod) {
        if (n == 1) {
            System.out.println("---Take disk 1 from rod " +  firstRod + " to rod " + secondRod);
            return;
        }

        towerOfHanoi(n-1, firstRod, auxRod, secondRod);
        System.out.println("Take disk " + n + " from rod " +  firstRod + " to rod " + secondRod);
        towerOfHanoi(n-1, auxRod, secondRod, firstRod);
    }
}