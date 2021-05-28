package ee.openx;

public class test2 {
    public static void main(String[] args) {

    }

    public static int findPathWay(int n, int m) {
        if (n > 0 && m > 0) {
            if (n == 1 || m == 1) {
                return 1;
            } else {
                return findPathWay(n - 1, m) + findPathWay(n, m - 1);
            }
        } else {
            return 0;
        }
    }
}