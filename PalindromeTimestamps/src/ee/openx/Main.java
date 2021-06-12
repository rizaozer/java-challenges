package ee.openx;

public class Main {

    private static int MAX_VALID_YEAR = 9999;
    private static int MIN_VALID_YEAR = 1800;

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public static boolean isValidDate(int d, int m, int y) {
        if(y > MAX_VALID_YEAR || y < MIN_VALID_YEAR) {
            return false;
        }
        if(m < 1 || m > 12) {
            return false;
        }
        if(d < 1 || d > 31) {
            return false;
        }
        if(m == 2) {
            if(isLeapYear(y)) {
                return (d <= 29);
            } else {
                return (d <= 28);
            }
        }

        if(m == 4 || m == 6 || m == 9 || m == 11) {
            return (d <= 30);
        }
        return true;
    }

    public static void printPalindromeDates(int y1, int y2) {

        for (int year = y1; year <= y2; year++) {
            String str = String.valueOf(year);
            String rev = str;
            rev = reverse(rev);

            int day = Integer.parseInt(rev.substring(0, 2));

            int month = Integer.parseInt(rev.substring(2, 2 + 2));

            if (isValidDate(day, month, year)) {
                System.out.println(rev + str + "\n");
            }
        }
    }

    public static String reverse(String input) {

        char[] a = input.toCharArray();
        int l, r = a.length - 1;
        for(l = 0; l < r; l++, r--) {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        int y1 = 2001, y2 = 2005;

        printPalindromeDates(y1, y2);
    }



}







































