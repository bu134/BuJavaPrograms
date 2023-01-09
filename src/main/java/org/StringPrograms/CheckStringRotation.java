package org.StringPrograms;


public class CheckStringRotation {

    public static void main(String[] args){

        String str1 = "abcde";
        String str2 = "deabc";
        checkRotation(str1, str2);
    }

    public static void checkRotation(String str1, String str2){

        int len = str1.length();
        str1 = str1 + str1;
        System.out.println("Str1 : " + str1);
        if(len!=str2.length()){
            System.out.println("Not a rotation");
        }
        else{
            if(str1.indexOf(str2) != -1){
                System.out.println(str2 + " is a rotation of " + str1);
            }else{
                System.out.println("Not a rotation");
            }
        }

    }

}
