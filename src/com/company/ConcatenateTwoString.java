package com.company;

import java.util.Scanner;


public class ConcatenateTwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String: ");
        String first=sc.nextLine();
        System.out.print("Enter Second String: ");
        String second= sc.nextLine();
        System.out.println("Final Answer: " +first.concat(second));

        StringBuffer rev = new StringBuffer(first.concat(second));
        rev.reverse();
        System.out.println("Reverse String: "+rev);
    }
}
