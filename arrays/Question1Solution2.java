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
 *
 * This solution is less optimal in memory usage than the last one
 */
public class Question1Solution2 {



        public  static int findMaxConsecutiveOnes(int[] nums) {
            int max1=0;

            for(int i=0;i<nums.length;i++){
                int max=findSequenceLength(i,nums);
                if(max>=max1){
                    max1=max;
                }
            }
            return max1;
        }


        public static int findSequenceLength(int startPosition, int[] nums){
            int max=0;
            if(nums[startPosition]==1){
                max=max+1;
            }
            for(int i=startPosition+1;i<nums.length;i++){

                if(nums[i]==1){
                    max=max+1;
                }else{
                    break;
                }

            }
            return max;
        }


    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
        System.out.println( findMaxConsecutiveOnes(array));

    }

}
