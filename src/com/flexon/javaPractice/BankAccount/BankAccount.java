package com.flexon.javaPractice.BankAccount;

public class BankAccount {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Jack", 500.0);
        BankAccount account2 = new BankAccount("Steve",100);
        BankAccount account3 = new BankAccount("Deep",200,"1123@123","12345");
        account.deposit(500);
        account.show_balance();
        account.withdraw(700);
        account2.withdraw(200);
        account.show_balance();
        account.show_info();
        account2.show_info();
        account3.show_info();

    }

    private int account_num;
    private double balance;
    private String customer_name;
    private String email;
    private String phone_num;

    private static int  account_num_init = 0;

    public BankAccount(String name, double refund){
        this.customer_name = name;
        this.balance = refund;
        this.account_num = account_num_init+1;
        account_num_init = this.account_num;
    }

    public BankAccount(String name, double refund, String email){
        this.customer_name = name;
        this.balance = refund;
        this.email = email;
        this.account_num = account_num_init+1;
        account_num_init = this.account_num;
    }

    public BankAccount(String name, double refund, String email, String phone_num){
        this.customer_name = name;
        this.balance = refund;
        this.email = email;
        this.phone_num = phone_num;
        this.account_num = account_num_init+1;
        account_num_init = this.account_num;
    }

    public void deposit(double amount_refund){
        this.balance+=amount_refund;
    }

    public void withdraw(double amount_withdraw){
        if (this.balance < amount_withdraw){
            System.out.println("Not Enough Balance!");
        }else{
            this.balance-=amount_withdraw;
            System.out.println("Balance is "+this.balance);
        }
    }

    public void show_balance(){
        System.out.println("Balance is "+this.balance);
    }

    public void show_info(){
        System.out.println("Name:"+this.customer_name);
        System.out.println("Account Number is "+this.account_num);
        System.out.println("Phone Number is "+this.phone_num);
        System.out.println("Email is "+this.email);
    }
}
