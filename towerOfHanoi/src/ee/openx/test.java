package ee.openx;

public class test {
    public static void main(String[] args) {
//        subtract1(5);
//        fact(5);
        System.out.println(factorial(5));
//        System.out.println(factorial(3));
    }

//    public static void subtract1(int number) {
//        System.out.println("Method= " + number);
//        if(number == 0) {
//            System.out.println("Done");
//        } else {
//            subtract1(number - 1);
//            System.out.println(number);
//        }
//    }

    public static int factorial(int number) {
        if(number >= 1) {
            System.out.println("Method=" + number);
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }

    public static void fact(int number) {
        if(number >= 1) {
            fact(number - 1);
            System.out.println("Method= " + number);
        } else {
            System.out.println("Done");
        }
    }
}
