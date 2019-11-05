package com.regrecall.easy;

/**
 * @author xingchi.wxc
 * @version : LongestCommonPrefix.java, v 0.1 2019年10月17日 19:48 regrecall Exp $
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        //String pre = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                commonPrefix = strs[i];
                continue;
            }

            int j = 0;
            for (; j < strs[i].length(); j++) {
                if (j >= commonPrefix.length() || strs[i].charAt(j) != commonPrefix.charAt(j)) {
                    break;
                }
            }

            if (j == 0) {
                commonPrefix = "";
                break;
            } else {
                commonPrefix = strs[i].substring(0, j);
            }
        }
        return commonPrefix;
    }

    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix2(strs1));
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix2(strs2));
    }
}