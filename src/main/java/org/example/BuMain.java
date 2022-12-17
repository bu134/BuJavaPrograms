package org.example;

import java.util.Arrays;
import java.util.Objects;

public class BuMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BuMain bu = new BuMain();
        //Counting number of repeated words in a string
        bu.countingWords("Big bu black bug bu bit a big black dog on his big bu lack nose");
        System.out.println(" ---------------------------------------------------- ");
        //All Characters related programs
        bu.countingCharacters("Big bu a ei ou dog");
        System.out.println(" ---------------------------------------------------- ");
        //Anagram
        bu.checkAnagram("Grab", "brag");
        System.out.println(" ---------------------------------------------------- ");
        //Dividing the string into equal parts
        bu.dividingString("Tech", 4);
        System.out.println(" ---------------------------------------------------- ");
        //Finding all substrings
        bu.findSubsets("Tech");
        System.out.println(" ---------------------------------------------------- ");
    }

    public void countingWords(String inputString){

        int count;
        inputString = inputString.toLowerCase();
        String[] words = inputString.split(" ");
        for(int i = 0; i < words.length; i++){
            count = 1;
            for(int j = i + 1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = "d";
                }
            }
            if(!Objects.equals(words[i], "d") && count > 1){
                System.out.println(words[i] + " : " + count);
            }
        }
    }

    public void countingCharacters(String inputCharacters){

        int count = 0;
        int vowelCount = 0;
        for(int i = 0; i < inputCharacters.length(); i++){
            if(inputCharacters.charAt(i)!= ' '){
                count++;
            }

            if(inputCharacters.charAt(i)== 'a' || inputCharacters.charAt(i)== 'e' || inputCharacters.charAt(i)== 'i' || inputCharacters.charAt(i)== 'o' || inputCharacters.charAt(i)== 'u'){
                vowelCount++;
            }
        }
        System.out.println("Total number of characters are : " + count);
        System.out.println("Total number of vowels are : " + vowelCount);
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

    public void dividingString(String inputString, int equalParts){

        int len = inputString.length();
        int temp = 0;
        String[] equalPartsString = new String[equalParts];
        if(len%equalParts != 0){
            System.out.println("Cannot divide string into equal parts");
        }else{
            for(int i = 0; i < len; i = i+(len/equalParts)){
                String subStr = inputString.substring(i,i+(len/equalParts));
                equalPartsString[temp] = subStr;
                temp++;
            }
        }

        for (String str : equalPartsString
             ) {
            System.out.println("The divided parts of string are : " + str);
        }
    }

    public void findSubsets(String inputString){

        int len = inputString.length();
        System.out.println(len);
        System.out.println(len*(len+1)/2);
        int temp = 0;
        String[] subArray = new String[len*(len+1)/2];
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                subArray[temp] = inputString.substring(i, j+1);
                temp++;
            }
        }
        for (String str : subArray
        ) {
            System.out.println("The substrings of string are : " + str);
        }
    }
}