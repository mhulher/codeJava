package sddClass;

public class Bank {
    int balance;
    public void deposit(int total) {
        { if (total < 0) total = 0;}
        balance = total + balance;

    }

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount) {
        {if (amount > balance) amount = 0;}
        balance = balance - amount;
    }

    public void recharge(int unit) {
    }
}
