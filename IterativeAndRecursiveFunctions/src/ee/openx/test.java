package ee.openx;

public class test {
    public static void main(String[] args) {
        System.out.println(countZero("1150045568700484"));
        System.out.println(countZero(1000));
        System.out.println(countZero_Recursive(100));
    }


    // Iterative functions
    public static int countZero(String numberString) {
       int counter = 0;
       for (int i = 0; i < numberString.length(); i++) {
          if(Integer.parseInt(numberString.substring(i, i + 1)) == 0 ) {
              counter++;
          }
       }
       return counter;
    }

    public static int countZero(int number) {
        if(number == 0) {
            return 1;
        }
        int counter = 0;
        while(number % 10 == 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }

    // Recursive functions
    public static int countZero_Recursive(int number) {
        if(number == 0) {
            return 1;
        } else if(number < 10) {
            return 0;
        }
        return countZero_Recursive(number / 10) + countZero_Recursive(number % 10);
    }

}
