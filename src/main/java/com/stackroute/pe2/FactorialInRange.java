package com.stackroute.pe2;

public class FactorialInRange {

    public static boolean listIntFactorial()
    {
        /*Integer i;
        for(i=1;factorial(i)>Integer.MIN_VALUE&&factorial(i)<Integer.MAX_VALUE;i++) {
            if(Integer.compareUnsigned((int)Math.log(factorial(i)),(int) Math.log(Integer.MAX_VALUE))>0)
                break;
            System.out.println("Factorial of " + i + " is " + factorial(i));

        }

        System.out.println("Factorial of "+i+" is  out of range");
            return true;

*/
        Long i;
        for(i=1l;factorial(i)>Long.MIN_VALUE&&factorial(i)<Long.MAX_VALUE;i++) {
            if(Long.compareUnsigned(factorial(i),Integer.MAX_VALUE)>0)
                break;

            System.out.println("Factorial of " + i + " is " + factorial(i));
        }
        System.out.println("Factorial of "+i+" is  out of range");
        return true;


    }
    public static boolean listLongFactorial()
    {
         Long i;
        for(i=1l;factorial(i)>Long.MIN_VALUE&&factorial(i)<Long.MAX_VALUE;i++) {
            if(Long.compareUnsigned(factorial(i),Long.MAX_VALUE)>0)
                break;

            System.out.println("Factorial of " + i + " is " + factorial(i));
        }
            System.out.println("Factorial of "+i+" is  out of range");
            return true;

    }




    public static Integer factorial(Integer n)
    {
        if(n==1)
            return 1;
        else
        {    if(n*factorial(n-1)<Integer.MAX_VALUE)
            return n*factorial(n-1);
            return Integer.MAX_VALUE;
        }
    }
    public static Long factorial(Long n)
    {
        if(n==1)
            return 1l;
        else return n*factorial(n-1);
    }
}
