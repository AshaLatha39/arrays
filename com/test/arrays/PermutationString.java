package com.test.arrays;

import java.util.Arrays;

public class PermutationString {

    public static void main(String args[]) {

        System.out.println(permutation("net","ten"));

    }

    // two strings are said to be permutated strings if they have same chars but in different order ex god,dog
    // things to consider, if the requirment is string on case sentitivity, white spaces etc

    public static boolean permutation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        if (sort(s1).equals(sort(s2))) {
            return true;
        }
        return false;

    }

    private static String sort(String s1) {

        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        return new String(ch);

    }
}
