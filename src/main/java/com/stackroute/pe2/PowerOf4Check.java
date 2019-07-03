package com.stackroute.pe2;
//Java program to check if a given number is power of 4
public class PowerOf4Check {

    static String CheckPower(int n) {
        if(n<1)return null;
        if (n == 1) return "true";
        if (n % 4 != 0) {
            return "false";

        } else {
            n = n / 4;
        }
        return CheckPower(n);
    }
}
