package ee.openx;

public class Main {

    public static void main(String[] args) {
        System.out.println(countBunnyEars(5));
    }

    public static int countBunnyEars(int numberOfBunny) {
        if(numberOfBunny == 0) {
            return 0;
        } else if(numberOfBunny == 1) {
            return 1;
        } else if (numberOfBunny % 2 == 0) {
            return countBunnyEars(numberOfBunny - 1) + 3;
        } else if (numberOfBunny % 2 != 0) {
            return countBunnyEars(numberOfBunny - 1) + 2;
        }
        return 0;
    }
}
