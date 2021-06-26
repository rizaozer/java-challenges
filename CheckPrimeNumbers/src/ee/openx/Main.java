package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(1000));
    }

    public static int isPrimeNumber(int number) {
        int counter = 0;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                boolean flag = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    System.out.println(i + " % " + j);
                        if (i % j == 0) {
                            flag = false;
                            break;
                        }
                }
                if(flag) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
