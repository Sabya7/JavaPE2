package com.stackroute.pe2;
//a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
//signed integer).
public class example {
    public static void main(String[] args) {
        System.out.println(factorial(17));
    }

    public static Integer factorial(Integer n) {
       int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}
