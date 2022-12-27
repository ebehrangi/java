/**
 * *
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */

import java.util.ArrayList;
import java.util.Collections;


public class Question1 {


    public static int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            if (num == 1)
                count += 1;
            else {
                count = 0;
            }
            n.add(count);
        }
        return Collections.max(n);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
        System.out.println( findMaxConsecutiveOnes(array));

    }

}
