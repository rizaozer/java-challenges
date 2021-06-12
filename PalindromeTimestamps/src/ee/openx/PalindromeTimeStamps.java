package ee.openx;

public class PalindromeTimeStamps {
    public static void main(String[] args) {
        palindromeTimestamps(2, 12, 22, 10, 35, 4);
    }

    public static void palindromeTimestamps(int hour1, int minute1, int second1, int second2, int minute2, int hour2) {

        boolean flag = true;
        while (flag) {
            second1++;
            if(hour1 == second1 && minute1 % 10 == minute1 / 10 && minute1 != 0) {
                System.out.println(hour1 + " : " + minute1 + " : " + second1);
            }
            if (second1 == 60) {
                minute1++;
                second1 = 0;
                if(minute1 == 60) {
                    minute1 = 0;
                    hour1++;

                    if(hour1 == hour2) {
                            flag = false;
                    }
                }
            }
        }
    }
}
