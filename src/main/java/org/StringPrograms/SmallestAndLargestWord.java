package org.StringPrograms;

public class SmallestAndLargestWord {

    public static void main(String[] args){

        String str = "BZ-176 is too over powered";
        String[] temp = str.split(" ");
        String max = null, min = null;

        int maxWord = temp[0].length();
        int minWord = temp[0].length();

        for(int i=0; i< temp.length;i++){
            if(temp[i].length()>maxWord){
                maxWord = temp[i].length();
                max = temp[i];
            }
            if(temp[i].length()<minWord){
                minWord = temp[i].length();
                min = temp[i];
            }
        }

        System.out.println("Max word length : " +  maxWord + " " + max);
        System.out.println("Min word length: " +  minWord+ " " + min);

    }

}
