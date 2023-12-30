package org.example.BasicProgram;

public class PrimeNumber {

    public static void primeNumber(int number){
        int m= number/2;
        int flag =0;
        if(number ==0 ||number == 1){
            System.out.println(number +"is not a prime number");
        }else {
            for (int i=2;i<=m;i++){

                if (number%2==0){
                    System.out.println(number+"is not a prime number ");
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(number+" : is prime number");
            }
        }
    }
    public static void main(String[] args) {

        primeNumber(93);

    }
}
