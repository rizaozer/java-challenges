package ee.openx;

public class test {

        // Function to get the required minutes
        public static int get_palindrome_time(String str) {
            int hh;
            int mm;

            // Storing hour and minute value
            // in integral form
            // String str = "05:39";
            hh = Integer.parseInt(str.substring(0, 2));
            mm = Integer.parseInt(str.substring(3, 5));
            int requiredTime = 0;

            // Keep iterating till first digit
            // hour becomes equal to second
            // digit of minute and second digit
            // of hour becomes equal to first
            // digit of minute
            while (hh % 10 != mm / 10 || hh / 10 != mm % 10) {
                ++mm;

                // If mins is 60, increase hour, and
                // reinitilialized to 0
                if (mm == 60) {
                    mm = 0;
                    ++hh;
                }

                // If hours is 60, reinitialized to 0
                if (hh == 24) {
                    hh = 0;
                }
                ++requiredTime;
            }

            // Return the required time
            return requiredTime;
        }

        public static void main(String[] args) {
            // Given Time as a string
            String str = "05:39";

            // Function Call
            System.out.println(get_palindrome_time(str));
        }
    }

