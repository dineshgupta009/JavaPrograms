package org.example.BasicProgram;

import java.util.Base64;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        int balance =1000000,deposit,withdraw;
        Scanner sc =new Scanner(System.in);
        while (true){

            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();

                    if (balance> withdraw){
                        balance=balance-withdraw;
                        System.out.println("Please collect Amount and Available balance ="+ balance);
                    }else {
                        System.out.println("insufficient balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter Amount to deposit");
                    deposit = sc.nextInt();
                    balance = balance+deposit;
                    System.out.println("Amount Deposited And Available balance is " + balance);
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter Options between 1 to 4");
            }
        }
    }
}
