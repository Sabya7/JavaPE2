package com.stackroute.pe2;

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
