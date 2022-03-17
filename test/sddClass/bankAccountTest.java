package sddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class bankAccountTest {
    @Test
    public void depositTest (){
        Bank musty = new Bank();
        musty.deposit (2000);
        assertEquals(2000, musty.getBalance());
    }
    @Test
    public void depositNegative (){
        Bank musty = new Bank();
        musty.deposit (2500);
        musty.deposit (-1000);
        assertEquals(2500, musty.getBalance());
    }

    @Test
    public void withdraw(){
        Bank musty = new Bank();
        musty.deposit (3000);
        musty.deposit(1500);
        musty.withdraw(2000);
        assertEquals(2500, musty.getBalance());
    }

    @Test
    public void withdrawExcess(){
        Bank musty = new Bank();
        musty.deposit(5000);
        musty.withdraw(12000);
        assertEquals(5000, musty.getBalance());
    }

    @Test
    public void recharge(){
        Bank musty = new Bank();
        musty.deposit(1500);
        musty.recharge(2000);
        assertEquals(1500, musty.getBalance());
    }
}
