package org.example.StringProgram;

public class countString {

    public static void count(String str){
//      if we are counting blank space
        int i=str.length();
        System.out.println(i);
        System.out.println("===========================");
        int counting=0;
        for (int j=0;j<=str.length()-1;j++){
            if(str.charAt(j)!=' ')
                counting ++;
        }
        System.out.println(counting);
    }

    public static void main(String[] args) {

        count("we are here");

    }
}
