package mddClass;

public class Musty {
    int balance;
    public void deposit(int amount) {
        balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int cash) {
    }
}
