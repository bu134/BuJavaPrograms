package org.StringPrograms;

public class ChangeCase {
    public static void main(String[] args){

        String str1 = "dasetfrgFDsfDSFds fds AFDsfdws fdwaDEF FRF efdw";

        StringBuffer newStr=new StringBuffer(str1);
        convertCase(str1, newStr);

    }

    public static void convertCase(String str, StringBuffer newStr){

        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else{
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }

        System.out.println(newStr);

    }
}
