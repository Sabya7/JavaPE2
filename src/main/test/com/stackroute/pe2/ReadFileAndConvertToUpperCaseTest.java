package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReadFileAndConvertToUpperCaseTest {
    @Test
    public void ReadFileShouldReturnNumberOfBytesCorrectly()
    {
        try {
            long result = ReadFileAndConvertToUpperCase.fileRead("/home/sabya/JavaPE2/src/main/java/com/" +
                    "stackroute/pe2/ReverseInputChecKPalindrome.java");
            assertEquals(762, result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void ReadFileShouldReturnNumberOfBytesCorrectly2()
    {
        try {
            long result = ReadFileAndConvertToUpperCase.fileRead("/home/sabya/JavaPE2/src/main/test/com/stackroute/pe2/PowerOf4CheckTest.java");
            assertEquals(757, result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}