package com.robtsai;

// Encapsulation - bundle data and methods that operate the data
// in one class and hiding the values and state of the class

// Abstraction - hide implementation details to reduce complexity

// Inheritance - framework to reuse code

// Polymorphism - ability of an object to take on many forms


public class Account {
    private float balance;

    public void deposit(float amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public float getBalance() {
        return balance;
    }


}
