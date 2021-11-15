package com.company;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String name= sc.nextLine();
        System.out.print("Enter Starting Index: ");
        int start=sc.nextInt();
        System.out.print("Enter End Index: ");
        int end=sc.nextInt();
        System.out.println("Your Result: " +name.substring(start , end));
    }
}
