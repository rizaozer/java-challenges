package ee.openx;

public class test {
    public static void main(String[] args) {
//        subtract1(5);
        System.out.println(fact(3));
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

    public static int fact(int number) {
        if(number >= 1) {
            return number * fact(number - 1);
        } else {
            return 1;
        }
    }
}
