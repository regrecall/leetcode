package com.regrecall.easy;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * @author xingchi.wxc
 * @version : ValidParentheses.java, v 0.1 2019年11月05日 15:06 regrecall Exp $
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        Set<String> forward = new HashSet<String>();
        forward.add("(");
        forward.add("[");
        forward.add("{");
        Map<String, String> maps = new LinkedHashMap<String, String>();
        maps.put(")", "(");
        maps.put("]", "[");
        maps.put("}", "{");


        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++){
            String str = s.charAt(i) + "";
            if (forward.contains(str)) {
                stack.push(str);
            } else {
                if (!stack.empty() && stack.peek().equalsIgnoreCase(maps.get(str))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValid1(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<String, String> maps = new LinkedHashMap<String, String>();
        maps.put("(", ")");
        maps.put("[", "]");
        maps.put("{", "}");

        for (int i = 0; i < s.length() /2 ; i++) {
            String str = s.charAt(i) + "";
            String str1 = s.charAt(s.length() - 1 -i) + "";
            if (!maps.get(str).equalsIgnoreCase(str1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}