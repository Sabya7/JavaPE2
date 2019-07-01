package com.stackroute.pe2;

public class PowerOf4Check {

     static boolean CheckPower(int n)
    {
        if (n==1)return true;
        if(n%4!=0)
        {
            return false;

        }
        else
        {
            n=n/4;
        }
        return CheckPower(n);
    }
}
