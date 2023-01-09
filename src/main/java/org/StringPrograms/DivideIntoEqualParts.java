package org.StringPrograms;

public class DivideIntoEqualParts {

    public static void main(String[] args){

        divideChar("dsaad dfeDSf dfa", 4);

    }

    public static void divideChar(String str, int div){

        String[] equalParts = new String[div];
        int temp = 0;

        if(str.length()%div!=0){
            System.out.println("String cannot be divided into equal parts");
        }
        else{
            int charLen = str.length()/div;
            for(int i = 0; i<str.length(); i+=charLen){
                equalParts[temp] = str.substring(i, i+charLen);
                temp++;
            }
        }

        for(String str1 : equalParts){
            System.out.println(str1);
        }
    }

}
