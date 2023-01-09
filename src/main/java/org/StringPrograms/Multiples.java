package org.StringPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiples {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("The 10 multiples are : ");
        findMultiples(n);
    }

    public static void findMultiples(int n){

        for(int i = 1; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + i*n);
        }

    }
}
