package com.udemy.junit.entitiy;

import com.udemy.junit.exception.InsufficientFundsException;

public class Account {
    int balance;
    String name;

    public Account(String name) {
        this.name = name;
    }

    void deposit(int dollars) {
        balance += dollars;
    }

    public void withdraw(int dollars) {

        if (balance < dollars) {
            throw new InsufficientFundsException("balance only " + balance);
        }
        balance -= dollars;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean hasPositiveBalance() {
        return balance > 0;
    }
}