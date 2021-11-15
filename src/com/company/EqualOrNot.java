package com.company;

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Num: ");
        int a= sc.nextInt();
        System.out.print("Enter Second Num: ");
        int b=sc.nextInt();

        if (a==b)
            System.out.println(a+ " Is Equal to " +b );
        else
            System.out.println(a+ " Is Not Equal to " +b);
    }
}
