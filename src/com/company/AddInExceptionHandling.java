package com.company;

import java.util.Scanner;

public class AddInExceptionHandling {
    public static void main(String[] args) {
        int a , b , result;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a=sc.nextInt();
        System.out.print("Enter Second Number: ");
        b=sc.nextInt();
        try {
            result= a + b;
            System.out.print("Result = "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught: Addition by zero.");
        }
    }
}
