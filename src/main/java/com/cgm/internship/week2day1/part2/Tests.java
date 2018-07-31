package com.cgm.internship.week2day1.part2;

import java.util.*;

public class Tests {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Bank number 1","RO234410ING9231122",10000);
        Bank bank2 = new Bank("Bank number 2","RO2345120ING954212",10000);

        Transaction t1 = new Transaction();
        t1.setId(4);
        t1.setDate("30-07-2018");
        t1.setFromBank(bank1);
        t1.setToBank(bank2);
        t1.setAmount(500);
        t1.transferMoney(t1.getFromBank(),t1.getToBank(),t1.getAmount());
        t1.setFromBankBalance(bank1.getBalance());
        t1.setToBankBalance(bank2.getBalance());
        System.out.println(t1.toString());

        Transaction t2 = new Transaction();
        t2.setId(2);
        t2.setDate("30-07-2018");
        t2.setFromBank(bank1);
        t2.setToBank(bank2);
        t2.setAmount(500);
        t2.transferMoney(t2.getFromBank(),t2.getToBank(),t2.getAmount());
        t2.setFromBankBalance(bank1.getBalance());
        t2.setToBankBalance(bank2.getBalance());
        System.out.println(t2.toString());

        Transaction t3 = new Transaction();
        t3.setId(1);
        t3.setDate("30-07-2018");
        t3.setFromBank(bank1);
        t3.setToBank(bank2);
        t3.setAmount(500);
        t3.transferMoney(t3.getFromBank(),t3.getToBank(),t3.getAmount());
        t3.setFromBankBalance(bank1.getBalance());
        t3.setToBankBalance(bank2.getBalance());
        System.out.println(t3.toString());

        Transaction t4 = new Transaction();
        t4.setId(3);
        t4.setDate("30-07-2018");
        t4.setFromBank(bank1);
        t4.setToBank(bank2);
        t4.setAmount(500);
        t4.transferMoney(t4.getFromBank(),t4.getToBank(),t4.getAmount());
        t4.setFromBankBalance(bank1.getBalance());
        t4.setToBankBalance(bank2.getBalance());
        System.out.println(t4.toString());

        Transaction t5 = new Transaction();
        t5 .setId(5);
        t5 .setDate("30-07-2018");
        t5 .setFromBank(bank1);
        t5 .setToBank(bank2);
        t5 .setAmount(500);
        t5 .transferMoney(t5 .getFromBank(),t5 .getToBank(),t5 .getAmount());
        t5 .setFromBankBalance(bank1.getBalance());
        t5 .setToBankBalance(bank2.getBalance());
        System.out.println(t5 .toString());

        //arraylist transactions===============================================================
        System.out.println();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(t1);
        transactions.add(t2);
        transactions.add(t3);
        transactions.add(t4);

        //add
        long startTime1 = System.nanoTime();
        transactions.add(t5);
        long estimated1 = System.nanoTime() - startTime1;
        Transaction.printResult("ArrayList Add",estimated1,"src/results.txt");

        //remove
        long startTime2 = System.nanoTime();
        transactions.remove(t5);
        long estimated2 = System.nanoTime() - startTime2;
        Transaction.printResult("ArrayList Remove",estimated2,"src/results.txt");

        //compare with equals
        long startTime3 = System.nanoTime();
        transactions.get(0).equals(t5);
        long estimated3 = System.nanoTime() - startTime3;
        Transaction.printResult("ArrayList equals",estimated3,"src/results.txt");

        //modify
        long startTime4 = System.nanoTime();
        transactions.get(0).setId(6);
        long estimated4 = System.nanoTime() - startTime4;
        Transaction.printResult("ArrayList modify",estimated4,"src/results.txt");

        System.out.println("ArrayList Transactions: ");
        for(Transaction tr: transactions){
            System.out.println(tr);
        }
//===============================================================================================
        //linkedlist transactions
        System.out.println();
        List<Transaction> transactions2 = new LinkedList<>();
        transactions2.add(t1);
        transactions2.add(t2);
        transactions2.add(t3);
        transactions2.add(t4);

        //add
        long startTime5 = System.nanoTime();
        transactions.add(t5);
        long estimated5 = System.nanoTime() - startTime5;
        Transaction.printResult("LinkedList Add",estimated5,"src/results.txt");

        //remove
        long startTime6 = System.nanoTime();
        transactions.remove(t5);
        long estimated6 = System.nanoTime() - startTime6;
        Transaction.printResult("LinkedList Remove",estimated6,"src/results.txt");

        //compare with equals
        long startTime7 = System.nanoTime();
        transactions.get(0).equals(t5);
        long estimated7 = System.nanoTime() - startTime7;
        Transaction.printResult("LinkedList equals",estimated7,"src/results.txt");

        //modify
        long startTime8 = System.nanoTime();
        transactions.get(0).setId(6);
        long estimated8 = System.nanoTime() - startTime8;
        Transaction.printResult("LinkedList modify",estimated8,"src/results.txt");

        System.out.println("LinkedList Transactions: ");
        for(Transaction tr2: transactions2){
            System.out.println(tr2);
        }
//======================================================================================================
        //vector transactions
        System.out.println();
        Vector<Transaction> transactions3 = new Vector<>();
        transactions3.add(t1);
        transactions3.add(t2);
        transactions3.add(t3);
        transactions3.add(t4);

        //add
        long startTime9 = System.nanoTime();
        transactions.add(t5);
        long estimated9 = System.nanoTime() - startTime9;
        Transaction.printResult("Vector Add",estimated9,"src/results.txt");

        //remove
        long startTime10 = System.nanoTime();
        transactions.remove(t5);
        long estimated10 = System.nanoTime() - startTime10;
        Transaction.printResult("Vector Remove",estimated10,"src/results.txt");

        //compare with equals
        long startTime11 = System.nanoTime();
        transactions.get(0).equals(t5);
        long estimated11 = System.nanoTime() - startTime11;
        Transaction.printResult("Vector equals",estimated11,"src/results.txt");

        //modify
        long startTime12 = System.nanoTime();
        transactions.get(0).setId(6);
        long estimated12 = System.nanoTime() - startTime12;
        Transaction.printResult("Vector modify",estimated12,"src/results.txt");

        System.out.println("Vector Transactions: ");
        for(Transaction tr3: transactions3){
            System.out.println(tr3);
        }
//===============================================================================================
        //treemap transactions
        System.out.println();
        Map<String,Transaction> transactions4 = new TreeMap<>();
        transactions4.put("Transaction No. 4",t1);
        transactions4.put("Transaction No. 2",t2);
        transactions4.put("Transaction No. 1",t3);
        transactions4.put("Transaction No. 3",t4);

        //add
        long startTime13 = System.nanoTime();
        transactions.add(t5);
        long estimated13 = System.nanoTime() - startTime13;
        Transaction.printResult("TreeMap Add",estimated13,"src/results.txt");

        //remove
        long startTime14 = System.nanoTime();
        transactions.remove(t5);
        long estimated14 = System.nanoTime() - startTime14;
        Transaction.printResult("TreeMap Remove",estimated14,"src/results.txt");

        //compare with equals
        long startTime15 = System.nanoTime();
        transactions.get(0).equals(t5);
        long estimated15 = System.nanoTime() - startTime15;
        Transaction.printResult("TreeMap equals",estimated15,"src/results.txt");

        //modify
        long startTime16 = System.nanoTime();
        transactions.get(0).setId(6);
        long estimated16 = System.nanoTime() - startTime16;
        Transaction.printResult("TreeMap modify",estimated16,"src/results.txt");

        System.out.println("TreeMap Transactions: ");
        for(Map.Entry<String,Transaction> entry : transactions4.entrySet()) {
            String key = entry.getKey();
            Transaction value = entry.getValue();
            System.out.println(value);
        }
//==================================================================================================
        //linkedHashmap transactions
        System.out.println();
        Map<String,Transaction> transactions5 = new LinkedHashMap<>();
        transactions5.put("Transaction No. 4",t1);
        transactions5.put("Transaction No. 2",t2);
        transactions5.put("Transaction No. 1",t3);
        transactions5.put("Transaction No. 3",t4);

        //add
        long startTime17 = System.nanoTime();
        transactions.add(t5);
        long estimated17 = System.nanoTime() - startTime17;
        Transaction.printResult("LinkedHashMap Add",estimated17,"src/results.txt");

        //remove
        long startTime18 = System.nanoTime();
        transactions.remove(t5);
        long estimated18 = System.nanoTime() - startTime18;
        Transaction.printResult("LinkedHashMap Remove",estimated18,"src/results.txt");

        //compare with equals
        long startTime19 = System.nanoTime();
        transactions.get(0).equals(t5);
        long estimated19 = System.nanoTime() - startTime19;
        Transaction.printResult("LinkedHashMap equals",estimated19,"src/results.txt");

        //modify
        long startTime20 = System.nanoTime();
        transactions.get(0).setId(6);
        long estimated20 = System.nanoTime() - startTime20;
        Transaction.printResult("LinkedHashMap modify",estimated20,"src/results.txt");

        System.out.println("LinkedHashMap Transactions: ");
        for(Map.Entry<String,Transaction> entry : transactions5.entrySet()) {
            String key = entry.getKey();
            Transaction value = entry.getValue();
            System.out.println(value);
        }
//=================================================================================================
        //TreeSet transactions
        System.out.println();
        Set<Transaction> transactions6 = new TreeSet<>();
        transactions6.add(t1);
        transactions6.add(t2);
        transactions6.add(t3);
        transactions6.add(t4);

        //add
        long startTime21 = System.nanoTime();
        transactions.add(t5);
        long estimated21 = System.nanoTime() - startTime21;
        Transaction.printResult("TreeSet Add",estimated21,"src/results.txt");

        //remove
        long startTime22 = System.nanoTime();
        transactions.remove(t5);
        long estimated22 = System.nanoTime() - startTime22;
        Transaction.printResult("TreeSet Remove",estimated22,"src/results.txt");

        //compare with equals
        long startTime23 = System.nanoTime();
        transactions.get(0).equals(t5);
        long estimated23 = System.nanoTime() - startTime23;
        Transaction.printResult("TreeSet equals",estimated23,"src/results.txt");

        //modify
        long startTime24 = System.nanoTime();
        transactions.get(0).setId(6);
        long estimated24 = System.nanoTime() - startTime24;
        Transaction.printResult("TreeSet modify",estimated24,"src/results.txt");

        System.out.println("TreeSet Transactions: ");
        for(Transaction tr2: transactions6){
            System.out.println(tr2);
        }
//==============================test equals and hashcode==================================================================

//        Transaction t9= new Transaction();
//        t9.setId(4);
//        t9.setDate("30-07-2018");
//        t9.setFromBank(bank1);
//        t9.setToBank(bank2);
//        t9.setAmount(500);
//        //t9.transferMoney(t9.getFromBank(),t9.getToBank(),t9.getAmount());
//        t9.setFromBankBalance(9500);
//        t9.setToBankBalance(10500);
//        System.out.println(t9.toString());
//        System.out.println(t1.toString());
//        System.out.println(t1.equals(t9));
//        System.out.println(t1.hashCode());
//        System.out.println(t9.hashCode());
//=========================================================================================================================
    }
}
