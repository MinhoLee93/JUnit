package com.udemy.junit;


import com.udemy.junit.entitiy.Account;
import com.udemy.junit.exception.InsufficientFundsException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;

// ...

public class ExceptionTest {

    private Account account;

    @Before
    public void before(){
        account = new Account("test");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void exceptionRule(){
        thrown.expect(InsufficientFundsException.class);
        thrown.expectMessage(equalTo("balance only 0"));

        account.withdraw(100);
    }
}
