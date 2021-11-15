package com.company;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String name= sc.nextLine();
        System.out.println("The Length of String: "+name.length() );
    }
}
