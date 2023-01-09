package org.StringPrograms;

public class LongestRepeatSequence {

    public static void main(String[] args){

        repeatSequence("abracadabra");

    }

    public static void repeatSequence(String str){
        String longestSequence;
        String longestRS="";
        for(int i=0; i<str.length();i++){
           for(int j=i+1; j<str.length();j++){
               longestSequence = findSubSequence(str.substring(i, str.length()), str.substring(j, str.length()));
               if (longestSequence == null) {
                   System.out.println("null");
               }else{
                   System.out.println("LS " + longestSequence);
               }
               if(longestSequence.length() > longestRS.length())
                   longestRS=longestSequence;
           }
        }
        System.out.println("LR " + longestRS);
    }

    public static String findSubSequence(String s1, String s2){
        System.out.println(s1);
        System.out.println(s2);
        int min = Math.min(s1.length(), s2.length());
        System.out.println(min);

        for(int k=0; k<min;k++){
            if(s1.charAt(k)!=s2.charAt(k)){
                return s1.substring(0,k);
            }
        }
        return s1.substring(0,min);
    }
}
