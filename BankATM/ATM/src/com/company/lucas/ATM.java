package com.company.lucas;

import java.util.Scanner;

public class ATM {
    int bankAccountNumber, PIN;
    String customerName;
    double balance;




    public void setCustomerCardDetails(){
        Scanner scanCard = new Scanner(System.in);

        System.out.println("What is your PIN?");
        PIN = scanCard.nextInt();
        scanCard.nextLine();

        System.out.println("What is your name?");
        customerName = scanCard.nextLine();

        System.out.println("What is your bank account number?");
        bankAccountNumber = scanCard.nextInt();

        System.out.println("Can you please enter your balance?");
        balance = scanCard.nextDouble();

    }
    public void showCostumerCardDetails() {
        System.out.println("Welcome " + customerName);
        System.out.println("Your bank account numer is: " + bankAccountNumber);
        System.out.println("You have " + balance + " in your card");
    }
    public void chooseOptionsInMenu(){
        int menu;

                Scanner scanMenu = new Scanner(System.in);
                System.out.println("How can i help you ?");
                System.out.println("1 - Deposit");
                System.out.println("2 - Withdraw");
                System.out.println("3 - Check Balance Quickly");
                System.out.println("4 - Exit");
                System.out.print("Choose your option number:");
                menu = scanMenu.nextInt();

                switch (menu) {
                    case 1:
                        deposit();
                        break;

                    case 2:
                        withdraw();
                        break;

                    case 3:
                        checkBalance();
                        break;

                    case 4:
                        System.out.println("Good Bye!!");
                        return ;

                    default:System.out.println("Invalid choice. Try again.");
                }




    }
    public void deposit(){
        System.out.println("Please enter the amount of money you want to deposit:");
        Scanner depositMoney = new Scanner(System.in);
        double deposit = depositMoney.nextDouble();
        this.balance += deposit;
        System.out.println("Ok, we made the deposit.");
        System.out.println("You have now: " + balance);
        askingForService();
    }
    public void withdraw(){
        System.out.println("Please enter the amount of money you want withdraw:");
        Scanner withdrawMoney = new Scanner(System.in);
        double withdraw = withdrawMoney.nextDouble();
        if(withdraw>balance){
            System.out.println("Sorry, you don't have money enough");
        }else{
        this.balance -= withdraw;
        System.out.println("Ok, we made the withdraw.");
        System.out.println("You have now: " + balance);
            askingForService();
    }}
    public void checkBalance(){
        System.out.println("You have " + balance + " in your card");
        askingForService();

    }
    public void askingForService(){
        System.out.println("Do you want something else ?");
        Scanner service = new Scanner(System.in);
        String askingService = service.nextLine();

        if(askingService.equals("YES")||askingService.equals("Y")){
            chooseOptionsInMenu();

        }else{
            System.out.println("Good Bye!!");
            return;

        }

    }
}
