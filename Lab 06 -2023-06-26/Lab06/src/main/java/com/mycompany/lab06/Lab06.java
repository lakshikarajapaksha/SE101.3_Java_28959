
package com.mycompany.lab06;


public class Lab06 {

    public static void main(String[] args) {
        //Savings
        SavingsAccount s = new SavingsAccount();
        s.setbalance(20000000.00);
        s.calculateInterest();
        
        //Checkings
        CheckingsAccount c = new CheckingsAccount();
        c.setbalance(1000000.00);
        c.calculateInterest();
    }
}
