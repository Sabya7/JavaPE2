package com.stackroute.pe2;
//a program, which reads number of students and n grades as input (of int
//between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
//program shall check for valid input. You should keep all the grades in an int[] and use a
//method for each of the computations.
public class MaxMinAvgGrade {
    public static float compute(int n,int[] grades)
    {
        int max=max(grades);
        int min=min(grades);
        float avg=avg(grades);
        return avg;
    }
    public static int max(int[] grades)
    {    int max=grades[0];
        for(int x:grades)
        {
            if(x>max)
                max=x;
        }
        System.out.println(max);
        return max;
    }
    public static int min(int[] grades)
    {    int min=grades[0];
        for(int x:grades)
        {
            if(x<min)
                min=x;
        }
        System.out.println(min);
        return min;
    }
    public static float avg(int[] grades)
    {    int sum=0;
        for(int x:grades)
        {
            sum+=x;

        }
        System.out.println(sum);
        return sum/grades.length;
    }

}
