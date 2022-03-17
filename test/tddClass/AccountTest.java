package tddClass;

import org.junit.jupiter.api.Test;

import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {

//given
        Account funmiAccount = new Account();
        funmiAccount.deposit(100);
        assertEquals(100, funmiAccount.getBalance());
    }

}