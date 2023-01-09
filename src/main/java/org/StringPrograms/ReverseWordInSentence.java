package org.StringPrograms;

public class ReverseWordInSentence {

    public static void main(String[] args){

        String str = "BZ-176 is too over powered";
        String[] temp = str.split(" ");
        String rev = null;
        System.out.println("Reverse of String is :");

        for(int i = 0; i< temp.length;i++){
            char[] ch = temp[i].toCharArray();
                for(int j =ch.length; j > 0;--j){
                    rev = rev + ch[j-1];
                }
                rev = rev + " ";
        }
        System.out.println(rev);
    }
}
