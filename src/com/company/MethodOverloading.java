package com.company;

class Adder{
    static double add(double a, double b, double c, double d){
        return a+b+c+d;
    }}
 class MethodOverLoading{
       public static void main(String arg[]){
           System.out.print("The Sum is : ");
           System.out.print(Adder.add(2,3,4,5));
       }
 }

