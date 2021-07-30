package ee.openx;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        semiprime(n);

        n = 8;
        semiprime(n);
    }
    
    public static int checkSemiprime(int num) {
        int count = 0;

        for (int i = 2; count < 2 && i * i <= num; ++i) {
            while (num % i == 0) {
                num /= i;
                ++count;
            }
        }
        // If number is greater than 1,
        // add it to the  variable
        // as it indicates the number
        // remain is prime number
        if (num > 1) {
            ++count;
        }

        // Return '1' if  is equal
        // to '2' else return '0'
        return count == 2 ? 1 : 0;
    }

    // Function to print 'True' or 'False'
    // according to condition of semiprime
    static void semiprime(int n)
    {
        if (checkSemiprime(n) != 0)
            System.out.printf("True\n");
        else
            System.out.printf("False\n");
    }
    
}
