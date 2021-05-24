package ee.openx;

import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            int[] nums = { 1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2 };
            System.out.println("\nOriginal array: "+ Arrays.toString(nums));
            System.out.println(findLongestConsecutiveSequence(nums));
        }

        public static int findLongestConsecutiveSequence(int[] nums) {

            boolean flag = false;
            int result = 0, start = 0, end = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] < nums[i]) {
                    end = i;
                } else {
                    start = i;
                }
                if (end - start > result) {
                    flag = true;
                    result = end - start;
                }
            }
            if (flag)
            {
                return result + 1;
            }
            else
            {
                return result;
            }
        }
    }
