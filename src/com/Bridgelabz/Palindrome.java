package com.Bridgelabz ;
import java.util.Scanner ;

public class Palindrome {

    public static void main(String[] args)
    {
        System.out.println("********************************************");
        System.out.println(" Welcome to Palindrome...");
        System.out.println("********************************************");

        /*
        Taking input from user
         */
        System.out.println(" Please Enter A Number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem, rev = 0;
        int temp = n;
        /*
        reversing a number
         */

        while (temp > 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        /*
        checking if no. is palindrome or not.
         */
        if (n==rev)
        {
            System.out.println("Given Number is Palindrome.");
        }
        else
        {
            System.out.println("Given Number is Not A Palindrome.");
        }

    }
}
