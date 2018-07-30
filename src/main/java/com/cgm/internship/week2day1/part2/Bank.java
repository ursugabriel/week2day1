package com.cgm.internship.week2day1.part2;

import java.util.Objects;

public class Bank {

    private String bankName;
    private String bankAccount;
    private double balance;

    public Bank(String bankName, String bankAccount, double balance) {
        this.bankName = bankName;
        this.bankAccount = bankAccount;
        this.balance = balance;
    }

    public static void transferMoney(Bank a, Bank b, double amount){
        double bankABalance=a.getBalance();
        double bankBBalance=b.getBalance();
//        a.s(bankABalance-amount)


    }

    public String getBankName() {
        return bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", balance=" + balance +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Double.compare(bank.balance, balance) == 0 &&
                Objects.equals(bankName, bank.bankName) &&
                Objects.equals(bankAccount, bank.bankAccount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bankName, bankAccount, balance);
    }
}
