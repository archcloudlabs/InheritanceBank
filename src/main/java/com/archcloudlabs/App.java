package com.archcloudlabs;
import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        System.out.println("Welcome to The Bank!");
        Scanner userin = new Scanner(System.in);

        Random accountId = new Random(); 
        Random money = new Random(); 


        System.out.println("Checking: 1\nSavings: 2");
        String input = userin.nextLine();
        while ( !input.equals("q")) {

            switch (input) {

            case "1":
                System.out.println("Beep boop - getting checking!");
                // Creating bob rosses checking account
                CheckingAccount check = new CheckingAccount(AccountTypes.CHECKINGS, accountId.nextInt(20000), "Bob Ross", money.nextDouble());
                check.setInterestRate(); // what happens if you comment this out and then print the to string method? Use the debugger to find out
                System.out.println("Name: " + check.getAccountHolderName());
                System.out.println("Create: " + check.accountCreationDate());
                System.out.println(check.toString());
                break;

            case "2":
                System.out.println("Beep boop - getting savings!");
                // Creating bob Ross's savings account
                SavingsAccount savings = new SavingsAccount(AccountTypes.SAVINGS, accountId.nextInt(20000), "Bob Ross", money.nextDouble());
                System.out.println("Name: " + savings.getAccountHolderName());
                System.out.println("Create: " + savings.accountCreationDate());
                savings.setInterestRate();
                System.out.println(savings.toString());
                break;

            default:
                System.out.println("ERROR - Bank application does not understand!");
                break;

            }

            System.out.println("\n[*]Checking: 1\n[*]Savings: 2\n");
            System.out.println("\n[*] Please enter an option or enter \"q\" to quit.");
            input = userin.nextLine();
        }
        userin.close();
    }
}
