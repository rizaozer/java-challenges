package ee.openx;

public class Main {

    public static void main(String[] args) {
        int [] [] triangleArray1 = {{15, 7}, {5, 22}, {11, 1}}; //  ➞ 47.08
        int [] [] triangleArray2 = {{0, 0}, {0, 1}, {1, 0}}; //  ➞ 3.42
        int [] [] triangleArray3 = {{-10, -10}, {10, 10}, {-10, 10}}; //  ➞ 68.28
        System.out.println(findPerimeter(triangleArray1));
        System.out.println(findPerimeter(triangleArray2));
        System.out.println(findPerimeter(triangleArray3));
    }

    public static double findPerimeter(int [] [] triangleArray) {
        double a = Math.sqrt((triangleArray[0][0] - triangleArray[1][0]) * (triangleArray[0][0] - triangleArray[1][0])
         + (triangleArray[0][1] - triangleArray[1][1]) * (triangleArray[0][1] - triangleArray[1][1]));

        double b = Math.sqrt((triangleArray[0][0] - triangleArray[2][0]) * (triangleArray[0][0] - triangleArray[2][0])
                + (triangleArray[0][1] - triangleArray[2][1]) * (triangleArray[0][1] - triangleArray[2][1]));

        double c = Math.sqrt((triangleArray[1][0] - triangleArray[2][0]) * (triangleArray[1][0] - triangleArray[2][0])
                + (triangleArray[1][1] - triangleArray[2][1]) * (triangleArray[1][1] - triangleArray[2][1]));
        return a + b + c;
    }
}
