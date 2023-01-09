package org.StringPrograms;

import java.util.Arrays;

public class Anagram {

    public static void main(String [] args){

        Anagram a = new Anagram();
        a.checkAnagram("Brag", "Giab");

    }

    public void checkAnagram(String string1, String string2){

        if(string1.length()!=string2.length()){
            System.out.println("The length of 2 string are not the same. They cannot be anagrams");
        }

        char[] char1 = string1.toLowerCase().toCharArray();
        char[] char2 = string2.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char1, char2)){
            System.out.println("The strings " + string1 +" and " + string2 + " are anagrams");
        }else{
            System.out.println("The strings " + string1 + " and " + string2 + " are NOT anagrams");
        }
    }

}
