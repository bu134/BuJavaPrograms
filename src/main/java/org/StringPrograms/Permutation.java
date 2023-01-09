package org.StringPrograms;

public class Permutation {

    public static void main(String[] args) {

        String str = "ABC";
        int len = str.length();
        findAllPermu(str, 0, len);

    }

    public static void findAllPermu(String str, int start, int end) {

        //System.out.println("Sting" + str);
        if (start == end - 1) {
            System.out.println(str);
        } else {
            int len = str.length();
            for (int i = start; i < len; i++) {
                str = swap(str, start, i);
               // System.out.println("swap : "  +str);
                findAllPermu(str, start + 1, end);
                str = swap(str, start, i);
            }
        }

    }

    public static String swap(String str, int i, int j) {
        char[] chr = str.toCharArray();
        char ch;
        ch = chr[i];
        chr[i] = chr[j];
        chr[j] = ch;

        return String.valueOf(chr);
    }
}
