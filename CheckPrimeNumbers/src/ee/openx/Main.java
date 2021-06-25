package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(20));
    }

    public static int isPrimeNumber(int number) {
        int counter = 0;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                System.out.println("i= " + i);
                if(i <= 5 && i % 2 != 0 || i < 5 && i % 3 != 0) {
                    counter++;
                }
                for (int j = 5; j <= i / 2; j++) {
                    System.out.println("j= " + j);
                    System.out.println();
                    if(i % j != 0) {
                        System.out.println("yes");
                        counter++;
                    }
                }
            }
            return counter;
        }
        return 0;
    }
}
