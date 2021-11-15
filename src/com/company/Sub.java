package com.company;

public class Sub extends First{
    Sub(int a, int b) {
        super(a, b);
    }
    public int ans(){
        return this.a - this.b;
    }
}
