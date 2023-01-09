package org.StringPrograms;

public class PuncCount {

    public static void main(String[] args){

        char punc = '"';
        countPunctuation("Yo, d. \"\"\"!, :;Hhs\"", punc);
    }

    public static void countPunctuation(String str, char punc){

        int count = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='\"'){
                count++;
            }
        }

        if(count>0){
            System.out.println("Punc is present : " + count + " times");
        }

    }
}
