package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Test
    public void isEvenShouldReturnTrue() {
        boolean result=EvenNumTest.isEven(12);
        assertEquals(true,result);
    }
    @Test
    public void isEvenShouldReturnTrue2() {
        boolean result=EvenNumTest.isEven(0);
        assertEquals(true,result);
    }
    @Test
    public void isEvenShouldReturnFalse() {
        boolean result=EvenNumTest.isEven(17);
        assertEquals(true,result);
    }
}