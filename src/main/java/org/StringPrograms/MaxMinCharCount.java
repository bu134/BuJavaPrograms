package org.StringPrograms;

public class MaxMinCharCount {

    public static void main(String[] args){

        String str1 = "acbbaccbbdeeeeef";
        countChar(str1);

    }

    public static void countChar(String str){

        int max = 0;
        int min = str.length();
        char[] ch = new char[str.length()];
        int count = 0;

        for(int i =0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count > max){
                max = count;
                ch[0] = str.charAt(i);
            }else if(count < min){
                min = count;
                ch[1] = str.charAt(i);
                System.out.println(str.charAt(i));
            }
            count = 0;
        }
        System.out.println("Max count char : " + ch[0] + " " + max + " times");
        System.out.println("Min count char : " + ch[1] + " " + min + " times");

    }
}
