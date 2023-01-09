package org.StringPrograms;

import java.util.Scanner;

public class Palindrome {

    public static void palindrome(String str){

        String rev = "";
        int len = str.length();
        for(int i=len-1; i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is NOT a palindrome");
        }
        System.out.println(Math.pow(2,3));
    }

    public static void main(String[] args){
        Scanner inputString = new Scanner(System.in);
        String input = inputString.next();
        palindrome(input);
    }
}
