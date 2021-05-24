package ee.openx;

import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            int[] nums = {100, 4, 200, 1, 3, 2};
            System.out.println(findLongestConsecutiveSequence(nums));

        }

        public static int findLongestConsecutiveSequence(int[] nums) {
            int longestConsecutiveSequence = 0;

            for (int i = 0; i < nums.length; i++) {
                int currentNumber = nums[i];
                int currentConsecutiveSequence = 1;
                int currentConsecutiveLength = 1;

                while(numberExists(nums, currentNumber + 1)) {
                    currentNumber++;
                    currentConsecutiveLength++;
                }
                longestConsecutiveSequence = Math.max(longestConsecutiveSequence, currentConsecutiveSequence);
            }
            return longestConsecutiveSequence;
        }

        public static boolean numberExists(int[] array, int number) {
            for (int i = 0; i < array.length; i++) {
                if(array[i] == number) {
                    return true;
                }
            }
            return false;
        }
    }
