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


    public String getBankName() {
        return bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
