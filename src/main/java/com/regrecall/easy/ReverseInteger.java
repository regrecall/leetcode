package com.regrecall.easy;

/**
 *
 * @author regrecall
 * @version $Id: ReverseInteger.java, v 0.1 2019年06月25日 15:49 regrecall Exp $
 */
public class ReverseInteger {

    public static int reverse(int x) {
        if (x >= 0) {
            String xStr = String.valueOf(x);
            StringBuilder reverseStr = new StringBuilder();
            for (int i = xStr.length() - 1; i >= 0; i--){
                reverseStr.append(xStr.charAt(i));
            }
            Long xL = Long.valueOf(reverseStr.toString());
            if (xL > Integer.MAX_VALUE) {
                return 0;
            } else {
                return xL.intValue();
            }
        } else {
            String xStr = String.valueOf(x);
            StringBuilder reverseStr = new StringBuilder();
            reverseStr.append('-');
            for (int i = xStr.length() - 1; i > 0; i--){
                reverseStr.append(xStr.charAt(i));
            }
            Long xL = Long.valueOf(reverseStr.toString());
            if (xL < Integer.MIN_VALUE) {
                return 0;
            } else {
                return xL.intValue();
            }
        }
    }

    public static int reverse1(int x) {
        StringBuilder reverseStr = new StringBuilder();
        if (x == 0) {
            return 0;
        } else if (x < 0) {
            reverseStr.append('-');
        }

        while (x != 0) {
            int m = x % 10;
            if (m < 0) {
                reverseStr.append(-m);
            } else {
                reverseStr.append(m);
            }
            x = x / 10;
        }
        Long xL = Long.valueOf(reverseStr.toString());
        if (xL < Integer.MIN_VALUE || xL > Integer.MAX_VALUE) {
            return 0;
        } else {
            return xL.intValue();
        }
    }

    public static int reverseB(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            if ((rev == Integer.MAX_VALUE / 10  && pop > 7 ) || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = 10 * rev + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x = -1111;
        int x1 = -120;
        int x2 = 123;
        int x3 = 4560;
        int x4 = 0;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(reverseB(x));
        System.out.println(reverseB(x1));
        System.out.println(reverseB(x2));
        System.out.println(reverseB(x3));
        System.out.println(reverseB(x4));
    }
}