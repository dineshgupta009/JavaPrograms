package org.example.BasicProgram;

import java.util.Scanner;

public class PrimeNumber2 {

    public static void main(String[] args) {

        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to cheque");
        int m= sc.nextInt();

        int n=m/2;
        if (m==0||m==1){
            System.out.println("Entered number is not prime number ");
        }else {
            for (int i=2;i<=n;i++){
                if (m%i==0){
                    System.out.println("Entered number is not prime number ");
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println("Entered number "+m +" is prime number");
            }
        }
    }
}
