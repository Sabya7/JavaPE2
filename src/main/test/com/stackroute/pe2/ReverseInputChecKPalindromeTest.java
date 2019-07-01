package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseInputChecKPalindromeTest{

    @Test
    public void ReverseInputShouldReturnNull() {
        String result= ReverseInputChecKPalindrome.checkPalindrome("");
        assertEquals(null,result);
    }

    @Test
    public void ReverseInputShouldReturnNullinCaseOfWhitespaces() {
        String result= ReverseInputChecKPalindrome.checkPalindrome("  ");
        assertEquals(null,result);
    }
    @Test
    public void ReverseInputShouldReturnTrue() {
        String result= ReverseInputChecKPalindrome.checkPalindrome("12344321");
        assertEquals("is a palindrome",result);
    }
    @Test
    public void ReverseInputShouldReturnFalse() {
        String result= ReverseInputChecKPalindrome.checkPalindrome("abccb");
        assertEquals("is not a palindrome",result);
    }
    @Test
    public void ReverseInputShouldReturnTrue1() {
        String result= ReverseInputChecKPalindrome.checkPalindrome("abccba");
        assertEquals("is a palindrome",result);
    }


}