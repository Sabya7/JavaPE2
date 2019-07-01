package com.stackroute.pe2;

public class ReverseInputChecKPalindrome
{
    public static String checkPalindrome(String input) {
            /*System.out.println("Enter a character or number sequence");
            Scanner scan =new Scanner(System.in);
            String input=scan.nextLine();*/
        if(input.matches("\\s+"))
            return null;
        if(input=="")
            return null;
        if(isPalindrome(input))
        {
            return "is a palindrome";
        }
        else
        {
            return "is not a palindrome";
        }

    }
    private static boolean isPalindrome(String s)
    {
        StringBuffer test =new StringBuffer(s);
        test= test.reverse();
        return s.equals(new String(test));
    }
}


