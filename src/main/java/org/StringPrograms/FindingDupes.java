package org.StringPrograms;

public class FindingDupes {

    public static void main(String[] args){

        String str = "yo yo z";
        int len = str.length();
        int count;
        char[] ch = str.toCharArray();
        System.out.println("Dup chars are");

        for(int i = 0; i < len; i++){
            count=1;
            for(int j = i+1; j < len; j++){
                if(ch[i]==ch[j] && ch[i]!=' ') {
                    count++;
                    ch[j]='0';
                }
            }

            if(count > 1 && ch[i] != '0')
                System.out.println(ch[i]);
            }
        }


}

