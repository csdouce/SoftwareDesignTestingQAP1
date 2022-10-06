package com.keyin.qap1;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId(){return this.id;}

    public String getName(){return this.name;}

    public int getBalance(){return this.balance;}

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) throws NotEnoughFundsException {
        if(amount <= this.balance){
            this.balance -= amount;
        } else {
            throw new NotEnoughFundsException();
        }
        return this.balance;
    }

    public int transferTo(Account anotherAccount, int amount) throws NotEnoughFundsException {
        if(amount <= this.balance){
            this.balance -= amount;
            anotherAccount.balance += amount;
        } else {
            throw new NotEnoughFundsException();
        }

        return this.balance;
    }
}
