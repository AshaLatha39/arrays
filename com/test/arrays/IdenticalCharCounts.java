package com.test.arrays;

public class IdenticalCharCounts {

    public static void main(String args[]){

        System.out.println(identicalChars("i am asha","i am lath"));
    }

    // here the logic used is some thing like hashtable
    //store the occurence of each character
    // create a int array
    // loop through the first string and increment the count for specific character
    // loop through the second array and decrement the count
    // if the value goes negative then strings are not with identical chars
    // ex first string is i am happy , second string is happy i am
    // store ascii char of i+1 in first array , during second array decrement happens and becomes zero
    public static boolean identicalChars(String s1,String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        int[] letters = new int[128];
        for(int i=0;i<s1.length();i++){

            char val = s1.charAt(i);
            System.out.println(val);
            letters[val] = letters[val] + 1;

        }

        for(int i=0;i<s2.length();i++){
            letters[s2.charAt(i)]--;
            if(letters[s2.charAt(i)]<0){
                return false;
            }
        }
        return true;
    }
}
