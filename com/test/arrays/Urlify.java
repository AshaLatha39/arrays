package com.test.arrays;

public class Urlify {

    public static void main(String args[]) {

        String s = "Mr John Smith";
        String extraSpaces = "    ";
        char[] ch = (s + extraSpaces).toCharArray();
        replaceSpaces(ch, s.length());
        System.out.println(new String(ch));

    }

    public static String replaceSpaces(char[] str, int length) {

        int j = str.length - 1;
        for (int i = length - 1; i >= 0 && i < j; --i) {
            if (str[i] == ' ') {
                str[j--] = '0';
                str[j--] = '2';
                str[j--] = '%';
            } else {
                str[j--] = str[i];
            }
        }

        return new String(str);
    }
}
