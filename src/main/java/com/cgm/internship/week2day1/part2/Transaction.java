package com.cgm.internship.week2day1.part2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

public class Transaction implements Comparable<Transaction>{
    private int id;
    private String date ;
    private Bank fromBank;
    private double fromBankBalance;
    private Bank toBank;
    private double toBankBalance;
    private double amount;

    public  Transaction(){}

    public Transaction(int id,String date, Bank fromBank, double fromBankBalance, Bank toBank, double toBankBalance, double amount) {
        this.id = id;
        this.date = date;
        this.fromBank = fromBank;
        this.fromBankBalance = fromBankBalance;
        this.toBank = toBank;
        this.toBankBalance = toBankBalance;
        this.amount = amount;
    }


    public void transferMoney(Bank a, Bank b, double amount){
        double oldABalance =a.getBalance();
        double oldBBalance =b.getBalance();
        a.setBalance(oldABalance-amount);
        if(a.getBalance()==(oldABalance-amount)){
            b.setBalance(oldBBalance+amount);
            if(b.getBalance()==(oldBBalance+amount)){
                System.out.println("Transaction done!");
            }
            else {
                b.setBalance(oldBBalance);
                System.out.println("There was an error in processing the transaction!");
            }
        }
        else {
            a.setBalance(oldABalance);
            System.out.println("There was an error in processing the transaction!");
        }
    }


    public static void printResult(String details, long time,String fl){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fl,true))){
            bufferedWriter.write(details +": "+time+" nanoseconds");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        catch (FileNotFoundException e){
            System.out.println("File "+fl+" not found!");
        }
        catch (IOException e){
            System.out.println("Writing error!");

        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bank getFromBank() {
        return fromBank;
    }

    public void setFromBank(Bank fromBank) {
        this.fromBank = fromBank;
    }

    public double getFromBankBalance() {
        return fromBankBalance;
    }

    public void setFromBankBalance(double fromBankBalance) {
        this.fromBankBalance = fromBankBalance;
    }

    public Bank getToBank() {
        return toBank;
    }

    public void setToBank(Bank toBank) {
        this.toBank = toBank;
    }

    public double getToBankBalance() {
        return toBankBalance;
    }

    public void setToBankBalance(double toBankBalance) {
        this.toBankBalance = toBankBalance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Transaction))
        {
            return false;
        }
        Transaction that = (Transaction) o;
        return id == that.id &&
                that.fromBankBalance == fromBankBalance &&
                that.toBankBalance == toBankBalance &&
                that.amount == amount &&
                Objects.equals(date, that.date) &&
                Objects.equals(fromBank, that.fromBank) &&
                Objects.equals(toBank, that.toBank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,date, fromBank, fromBankBalance, toBank, toBankBalance, amount);
    }

    @Override
    public String toString() {
        return "Transaction No. " + id +
                ", on " + date +
                ", from " + fromBank.getBankName() +
                ", to " + toBank.getBankName() +
                ", for an amount of " + amount +
                ". "+fromBank.getBankName() +" current balance: " + fromBankBalance +
                ", "+ toBank.getBankName()+" current balance: " + toBankBalance +
                '.';
    }


    @Override
    public int compareTo(Transaction t) {
        if(id==t.id)
            return 0;
        else if(id>=t.id)
            return 1;
        else
            return -1;
    }
}
