package ee.openx;

public class test {
    public static void main(String[] args) {
        minus1(5);
    }

    public static void minus1(int number) {
        if(number > 0) {
            minus1(number - 1);
            System.out.println(number);
        }
    }
}
