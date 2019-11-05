package com.regrecall.easy;

import java.util.HashMap;

/**
 *
 * @author regrecall
 * @version $Id: TwoSum1.java, v 0.1 2019年06月21日 14:09 regrecall Exp $
 */
public class TwoSum1 {

    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        int[] ret = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            maps.put(nums[i], i);
            int value = target - nums[i];
            if (maps.containsKey(value) && maps.get(value) != i) {
                ret[0] = maps.get(value);
                ret[1] = i;
                break;
            }
        }
        return ret;
    }

}