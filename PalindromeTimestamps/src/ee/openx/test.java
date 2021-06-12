package ee.openx;

public class test {

        public static int get_palindrome_time(String str) {
            int hour;
            int minute;

            hour = Integer.parseInt(str.substring(0, 2));
            minute = Integer.parseInt(str.substring(3, 5));
            int requiredTime = 0;

            while (hour % 10 != minute / 10 || hour / 10 != minute % 10) {
                ++minute;
                if (minute == 60) {
                    minute = 0;
                    ++hour;
                }
                if (hour == 24) {
                    hour = 0;
                }
                ++requiredTime;
            }
            return requiredTime;
        }

        public static void main(String[] args) {
            String str = "05:39";
            System.out.println(get_palindrome_time(str));
        }
    }

