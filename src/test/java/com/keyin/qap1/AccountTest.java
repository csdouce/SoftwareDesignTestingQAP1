package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testCredit(){

        Account account1 = new Account("Account 1", "John Joseph", 2525);

        Assertions.assertEquals(3025, account1.credit(500));

        Assertions.assertNotEquals(5000, account1.credit(200));
    }

    @Test
    public void testDebit() throws NotEnoughFundsException {

        Account account2 = new Account("Account 2", "Jane McDonald", 50111);

        Assertions.assertEquals(10111, account2.debit(40000));

        boolean exceptionThrown = false;

        try{
            account2.debit(40000);
        } catch(NotEnoughFundsException e){
            exceptionThrown = true;
        }

        Assertions.assertTrue(exceptionThrown);

        int accountBalance = account2.debit(10111);
        Assertions.assertTrue(accountBalance == 0);
    }

    @Test
    public void testTransferTo() throws NotEnoughFundsException {

        Account account3 = new Account("Account 3", "Natasha St. Louis", 45000);
        Account account4 = new Account("Account 4", "Dan O'Toole", 15000);

        int account3Balance = account3.transferTo(account4, 10000);

        Assertions.assertFalse(account3Balance == 45000);
        Assertions.assertTrue(account3Balance == 35000);

        Assertions.assertFalse(account4.getBalance() == 15000);
        Assertions.assertTrue(account4.getBalance() == 25000);

        boolean noFundsException = false;

        try{
            account4.transferTo(account3, 30000);
        } catch (NotEnoughFundsException e) {
            noFundsException = true;
        }

        Assertions.assertTrue(noFundsException);

        noFundsException = false;

        try{
            account4.transferTo(account3, 5000);
        } catch (NotEnoughFundsException e) {
            noFundsException = true;
        }

        Assertions.assertFalse(noFundsException);

    }
}
