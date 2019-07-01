package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialInRangeTest {

    @Test
    public void listIntFactorialShouldReturnTrue() {
        boolean result=FactorialInRange.listIntFactorial();
        assertEquals(true,result);
    }

    @Test
    public void listLongFactorialShouldReturnTrue() {
        boolean result=FactorialInRange.listLongFactorial();
        assertEquals(true,result);
    }
}