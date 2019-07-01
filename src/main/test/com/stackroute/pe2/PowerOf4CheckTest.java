package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4CheckTest {

    @Test
    public void PowerOf4CheckShouldReturnTrue()
    {
      boolean result=PowerOf4Check.CheckPower(1);
      assertEquals(true,result);
    }

    @Test
    public void PowerOf4CheckShouldReturnTrue1()
    {
        boolean result=PowerOf4Check.CheckPower(4);
        assertEquals(true,result);
    }
    @Test
    public void PowerOf4CheckShouldReturnFalse()
    {
        boolean result=PowerOf4Check.CheckPower(4*5);
        assertEquals(false,result);
    }
    @Test
    public void PowerOf4CheckShouldReturnFalse1()
    {
        boolean result=PowerOf4Check.CheckPower(13);
        assertEquals(false,result);
    }
}