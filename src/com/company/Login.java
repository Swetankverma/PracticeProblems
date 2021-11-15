package com.company;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set your Login Id: ");
        String set = sc.nextLine();
        System.out.print("Enter your login Id: ");
        String login = sc.nextLine();

        System.out.println(set.equalsIgnoreCase( login));
    }
}
