package com.regrecall.easy;

/**
 *
 * @author regrecall
 * @version $Id: PalindromeNumber.java, v 0.1 2019年07月18日 14:59 regrecall Exp $
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originX = x;
        int y = 0;
        while (x != 0) {
            int z = x % 10;
            y = y * 10 + z;
            x = x / 10;
        }
        return originX == y;
    }

    public static boolean isPalindrome1(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNum = 0;
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }

        return x == reversedNum || x == reversedNum / 10;
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome1(123));
        //System.out.println(isPalindrome1(121));
        //System.out.println(isPalindrome1(-121));
        //System.out.println(isPalindrome1(10));
        //System.out.println(isPalindrome1(101));

        int i = 5;
        switch (i) {
            case 0:
                System.out.println("0");
                break;
            default:
                System.out.println("hi");
                break;
            case 5:
                System.out.println("5");
                break;
        }

    }
}