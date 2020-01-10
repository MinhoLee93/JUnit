package com.udemy.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ExampleTests {

    @Test
    public void exampleTest(){
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN(14081234);
        assertTrue(result);
    }
}
