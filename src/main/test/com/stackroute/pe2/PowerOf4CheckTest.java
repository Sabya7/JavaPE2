package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4CheckTest {

    @Test
    public void PowerOf4CheckShouldReturnTrue() {
        String result = PowerOf4Check.CheckPower(1);
        assertEquals("true", result);
    }

    @Test
    public void PowerOf4CheckShouldReturnTrue1() {
        String result = PowerOf4Check.CheckPower(4);
        assertEquals("true", result);
    }

    @Test
    public void PowerOf4CheckShouldReturnFalse() {
        String result = PowerOf4Check.CheckPower(4 * 5);
        assertEquals("false", result);
    }

    @Test
    public void PowerOf4CheckShouldReturnFalse1() {
        String result = PowerOf4Check.CheckPower(13);
        assertEquals("false", result);
    }

    @Test
    public void PowerOf4CheckShouldReturnNull() {
        String result = PowerOf4Check.CheckPower(0);
        assertNull("Invalid Input", result);
    }
    @Test
    public void PowerOf4CheckShouldReturnNull2() {
        String result = PowerOf4Check.CheckPower(-5);
        assertNull("Invalid Input", result);
    }
}