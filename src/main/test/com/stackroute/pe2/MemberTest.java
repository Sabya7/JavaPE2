package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    @Test
    public void MemberShouldBeInitialisedCorrectly()
    {
        String result=MemberVariable.setMemberFields("paku",23,100.36);
        assertEquals("paku 23 100.36",result);
    }
    @Test
    public void MemberShouldBeInitialisedCorrectly2()
    {
        String result=MemberVariable.setMemberFields("paku",0,100.36);
        assertEquals("paku 0 100.36",result);
    }
    @Test
    public void MemberShouldBeInitialisedCorrectly3()
    {
        String result=MemberVariable.setMemberFields("sabya",0,100.36);
        assertEquals("sabya 0 100.36",result);
    }
}