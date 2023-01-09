package org.StringPrograms;

import java.util.Objects;

public class FindingWordDupes {

    public static void main(String[] args){
        String str = "it it was was was a";
        String[] temp = str.split(" ");
        int count;

        System.out.println("Duplicate words are");

        for(int i=0; i < temp.length; i++){
            count = 1;
            for(int j=i+1; j< temp.length; j++ ){
                if(temp[i].equals(temp[j])){
                    count++;
                    temp[j]="0";
                }
            }

            if(!Objects.equals(temp[i], "0") && count > 1){
                System.out.println(temp[i] + count);
            }
        }
    }

}
