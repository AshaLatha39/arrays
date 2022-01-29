package com.test.arrays;

public class UniqueStringInSentence {

    /*
    Algorithm to determine if a string has all unique characters
     */
    public static void main(String args[]) {

        System.out.println("Algorithm to determine if a string has all unique characters");
        System.out.println(uniqueCheck("I dont have duplicate characters"));
        System.out.println(uniqueCheck("abcdefghijklmn##@@op"));

    }

    // algorithm with out using any java collections
    // The logic used here is assuming the char set is ascii
    // the max length of ascii is 128, so if the string length is greater than 128 then obviously the string had duplicates
    // use a boolean array where the flag at index i indicates the alphabet i is present in the string
    // loop through the string ex - asha
    // the first char is a and index is 0
    // get the flag value from index 0 in boolean array
    // if the flag returns true then the alphabet is already present in the string so return false
    // if the flag returns false update the array with the value true and continue the iteration
    // O(n) is the time complexity
    private static boolean uniqueCheck(String s) {

        if (s.toCharArray().length > 128) {
            return false;
        }
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); i++) {

            char val = s.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;

    }
}
