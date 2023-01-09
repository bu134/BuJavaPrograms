package org.StringPrograms;

public class CountCharacters {

    public static void main(String[] args){

        countChars("Hello there !", 'l');

    }

    public static void countChars(String str, char c){

        int count = 0;
        char[] ch = str.toCharArray();
        for(char letter : ch){
            if(letter==c){
                count++;
            }
        }

        System.out.println("The character " + c + " is present " + count + " times") ;

    }
}
