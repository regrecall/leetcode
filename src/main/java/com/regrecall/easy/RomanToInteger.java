package com.regrecall.easy;

/**
 * @author xingchi.wxc
 * @version : RomanToInteger.java, v 0.1 2019年10月15日 14:40 regrecall Exp $
 */
public class RomanToInteger {

    public static int romanToInt2(String s) {
        int ret = 0;
        int i = 0;
        String p = null;
        while (i < s.length()) {
            String x = "" + s.charAt(i);
            if (x.equals("M")) {
                if (p == null) {
                    ret += 1000;
                } else {
                    if (p == "C") {
                        ret += 1000 - 2 * 100;
                    } else {
                        ret += 1000;
                    }
                }
                p = "M";
            } else if (x.equals("D")) {
                if (p == null) {
                    ret += 500;
                } else {
                    if (p == "C") {
                        ret += 500 - 2 * 100;
                    } else {
                        ret += 500;
                    }
                }
                p = "D";

            } else if (x.equals("C")) {
                if (p == null) {
                    ret += 100;
                } else {
                    if (p == "X") {
                        ret += 100 - 2 * 10;
                    } else {
                        ret += 100;
                    }
                }
                p = "C";

            } else if (x.equals("L")) {
                if (p == null) {
                    ret += 50;
                } else {
                    if (p == "X") {
                        ret += 50 - 2 * 10;
                    } else {
                        ret += 50;
                    }
                }
                p = "L";
            } else if (x.equals("X")) {
                if (p == null) {
                    ret += 10;
                } else {
                    if (p == "I") {
                        ret += 10 - 2 * 1;
                    } else {
                        ret += 10;
                    }
                }
                p = "X";
            } else if (x.equals("V")) {
                if (p == null) {
                    ret += 5;
                } else {
                    if (p == "I") {
                        ret += 5 - 2 * 1;
                    } else {
                        ret += 5;
                    }
                }
                p = "V";            }
            else if (x.equals("I")) {
                ret += 1;
                p = "I";
            }
            i++;
        }
        return ret;

    }


    public static int romanToInt(String s) {
        int ret = 0;
        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length()) {
                String x = "" + s.charAt(i) + s.charAt(i + 1);
                if (x.equals("IV")) {
                    ret += 4;
                    i += 2;
                    continue;
                } else if (x.equals("IX")) {
                    ret += 9;
                    i += 2;
                    continue;
                } else if (x.equals("XL")) {
                    ret += 40;
                    i += 2;
                    continue;
                }else if (x.equals("XC")) {
                    ret += 90;
                    i += 2;
                    continue;
                }else if (x.equals("CD")) {
                    ret += 400;
                    i += 2;
                    continue;
                }else if (x.equals("CM")) {
                    ret += 900;
                    i += 2;
                    continue;
                }
            }

            String x = "" + s.charAt(i);
            if (x.equals("M")) {
                ret += 1000;
            } else if (x.equals("D")){
                ret += 500;
            } else if (x.equals("C")){
                ret += 100;
            }else if (x.equals("L")){
                ret += 50;
            }else if (x.equals("X")){
                ret += 10;
            }else if (x.equals("V")){
                ret += 5;
            }else if (x.equals("I")){
                ret += 1;
            }

            i++;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println("III: " + romanToInt2("III"));
        System.out.println("IV: " + romanToInt2("IV"));
        System.out.println("IX: " + romanToInt2("IX"));
        System.out.println("LVIII: " + romanToInt2("LVIII"));
        System.out.println("MCMXCIV: " + romanToInt2("MCMXCIV"));
    }
}