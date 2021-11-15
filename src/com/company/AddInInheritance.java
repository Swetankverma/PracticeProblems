package com.company;
class Calculation{
    int sum;

    public void addition(int x, int y){
        sum= x= + y;
        System.out.println("The Sum of Given Number is "+sum);
    }
}

public class AddInInheritance extends Calculation {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        AddInInheritance demo=new AddInInheritance();
        demo.addition(x,y);
    }
}
