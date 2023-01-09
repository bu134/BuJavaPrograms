package org.StringPrograms;

public class FindAllSubsets {

    public static void main(String[] args){

        findSubsets("abcde");

    }

    public static void findSubsets(String str){

        int len = str.length();
        int temp = 0;
        String[]  subsetStr = new String[len*(len+1)/2];

        for(int i = 0; i<len;i++){
            for(int j=i; j<len;j++){
                subsetStr[temp] = str.substring(i, j+1);
                temp++;
            }
        }

        System.out.println("All subsets of " + str + " are : " + subsetStr.length + " and " + temp);
        for(String st : subsetStr){
            System.out.println(st);
        }
    }

}
