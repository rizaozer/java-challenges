package ee.openx;

public class Main {

        public static void main(String[] args) {
            int[] nums = {500, 12, 14, 22, 13, 8, 2, 15, 100, 1, 16};
            System.out.println(findLongestConsecutiveSequence(nums));
        }

        public static int findLongestConsecutiveSequence(int[] nums) {
            int longestConsecutiveSequence = 0;

            for (int i = 0; i < nums.length; i++) {
                int currentNumber = nums[i]; // 12
                int currentConsecutiveLength = 1;

                while(numberExists(nums, currentNumber + 1)) {
                    currentNumber++;
                    currentConsecutiveLength++;
                }
                longestConsecutiveSequence = Math.max(longestConsecutiveSequence, currentConsecutiveLength);
            }
            return longestConsecutiveSequence;
        }

        public static boolean numberExists(int[] array, int number) {
            for (int j : array) {
                if (j == number) {
                    return true;
                }
            }
            return false;
        }
    }
