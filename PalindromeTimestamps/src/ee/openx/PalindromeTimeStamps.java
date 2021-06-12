package ee.openx;

public class PalindromeTimeStamps {
    public static void main(String[] args) {
        palindromeTimestamps(12, 12, 12, 13, 13, 13);
    }

    public static void palindromeTimestamps(int hour1, int minute1, int second1, int second2, int minute2, int hour2) {

        boolean flag = true;
        boolean flag2 = true;
        int counter = 0;
        while (flag) {
            if(minute1 % 10 == minute1 / 10 && hour1 * 10 == second1 && minute1 != 0 ||
                    hour1 % 10 == second1 / 10 && hour1 / 10 == second1 % 10 && minute1 % 10 == minute1 / 10 && minute1 != 0) {
                System.out.println(hour1 + " : " + minute1 + " : " + second1);
                counter++;
            }
            second1++;
            if (second1 == 60) {
                minute1++;
                second1 = 0;
                if(minute1 == 60) {
                    minute1 = 0;
                    hour1++;
                    if(hour1 == hour2) {
                        while(flag2) {
                            second1++;
                            if(second1 == 60) {
                                second1 = 0;
                                minute1++;
                                if(minute1 == minute2) {
                                    for(second1 = 0; second1 <= second2; second1++) {
                                    }
                                    flag2 = false;
                                }
                            }
                        }
                            flag = false;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
