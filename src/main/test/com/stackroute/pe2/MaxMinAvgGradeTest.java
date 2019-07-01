package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinAvgGradeTest {

    @Test
    public void computeShouldReturnAvg() {
        int[] grades={10,20,30};
        float result=MaxMinAvgGrade.compute(3,grades);
        assertEquals(20.0f,result,0.0001);

    }

    @Test
    public void max() {
        int[] grades={10,20,30};
        int result=MaxMinAvgGrade.max(grades);
        assertEquals(30,result);
    }

    @Test
    public void min() {
        int[] grades={25,20,30};
        int result=MaxMinAvgGrade.min(grades);
        assertEquals(20,result);
    }

    @Test
    public void avg() {
        int[] grades={10,20,30};
        float result=MaxMinAvgGrade.compute(3,grades);
        assertEquals(20.0f,result,0.0001);

    }
}