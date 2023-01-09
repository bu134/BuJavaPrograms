package org.StringPrograms;

public class SeparateEachCharBySpace {

    public static void main(String[] args){

        String str = "BZ-176 is too over powered";
        String[] temp = str.split(" ");

        for(int i = 0; i< temp.length;i++) {
            char[] ch = temp[i].toCharArray();
            for(char c : ch){
                System.out.print(c + " ");
            }
        }

    }
}
