package com.regrecall.easy;

/**
 *
 * @author regrecall
 * @version $Id: TwoSum.java, v 0.1 2019年06月21日 10:52 regrecall Exp $
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        for (; i < nums.length; i++) {
            boolean isFound = false;
            for (j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }

        int[] arr = {i, j};
        return arr;
    }

}