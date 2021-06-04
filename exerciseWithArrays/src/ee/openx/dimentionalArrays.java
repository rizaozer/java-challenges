package ee.openx;

public class dimentionalArrays {
    public static void main(String[] args) {
        int[][] firstArray = {{-3, 1}, {33, 0}, {8, 2}, {2, 0}, {13, 1996}, {6, -5}, {66, 7}, {266, 0}};
        int[][] secondArray = {{0, 6}, {0, 5}, {0, 2}, {4, 34}, {0, 6}, {44, 0}, {5, 0}, {0, 2}};

        System.out.println("First Array: ");
        printArray(firstArray);
        System.out.println("Second Array: ");
        printArray(secondArray);
        System.out.println("Average value of first array: ");
        System.out.println(findAverage(firstArray));
        System.out.println("Average value of second array: ");
        System.out.println(findAverage(secondArray));
        System.out.println("Average value of first array row 0: ");
        System.out.println(findAverageRow0(firstArray));
        System.out.println("Minumum value in column 0: ");
        System.out.println(findMinColumn0(firstArray));
        System.out.println("Maximum value in row 1: ");
        System.out.println(findMaxRow1(firstArray));
    }

        public static void printArray(int [][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println((i + 1) + ".column " + (j + 1) + ". row -> " +array[i][j]);
                }
            }
        }

        // 3. Find average value
        public static int findAverage(int [][] array) {
            int sum = 0;
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                    counter += 1;
                }
            }
            return (sum / counter);
        }


        // 4. Find average value in row 0.
        public static int findAverageRow0(int [][] array) {
            int sum = 0;
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                    sum += array[i][0];
                    counter += 1;
            }
            return (sum / counter);
        }

        // 5. Find minimum in column 0.
        public static int findMinColumn0(int [][] array) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array[0].length; i++) {
                if(array[0][i] < min) {
                    min = array[0][i];
                }
            }
            return min;
        }

        // 6. Find maximum in row 1.
        public static int findMaxRow1(int [][] array) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(array[i][j] > max) {
                        max = array[i][1];
                    }
                }
            }
            return max;
        }
    }
