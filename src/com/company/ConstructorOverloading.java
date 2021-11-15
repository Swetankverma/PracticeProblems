package com.company;

public class ConstructorOverloading {
   static class Main{
       int sum;
       Main(){
           System.out.print("Sum = ");
       }
       Main(int a, int b, int c , int d){

           sum= a+b+c+d;
       }
       void display(){
           System.out.println(sum);
       }
       public static void main(String arg[]){
           int a=2, b=3, c=4, d=5;
           Main t=new Main();
           Main sum=new Main(a,b,c,d);
           sum.display();
       }
   }
}
