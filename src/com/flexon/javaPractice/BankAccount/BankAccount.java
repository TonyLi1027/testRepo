package com.flexon.javaPractice.BankAccount;

public class BankAccount {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Jack", 500.0);
        account.deposit(500);

    }

    private int account_num;
    private double balance;
    private  String customer_name;
    private String email;
    private String phone_num;

    public BankAccount(String name, double refund){
        this.customer_name = name;
        this.balance = refund;
    }
    
    public deposit(double amount_refund){
        this.balance+=amount_refund;
    }

    public withdraw(double amount_withdraw){
        if (this.balance < amount_withdraw){
            System.out.println("Not Enough Balance!");
        }else{
            this.balance-=amount_withdraw;
        }
    }

    public show_balace(){
        System.out.println("Balance is"+this.balance);
    }

    public print_info(){
        System.out.println("Name:"+this.customer_name);
        System.out.println("Account Number is"+this.account_num);
    }
}
