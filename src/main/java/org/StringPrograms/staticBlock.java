package org.StringPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class staticBlock {

    static boolean flag = false;
    static int B = 0;
    static int H = 0;
    static{
        System.out.println("No main method execution");
        System.out.println("Static block can be printed only with main method present for JDK version 1.6 and higher");
        System.out.println("Previously it can print without the main method");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            B = Integer.parseInt(bufferedReader.readLine().trim());
            H = Integer.parseInt(bufferedReader.readLine().trim());

            if(B < 0 || H < 0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }else{
                System.out.println("Numbers are positive");
                flag = true;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String [] args){

        if(flag){
            int area=B*H;
            System.out.print(area);
        }


    }

}
