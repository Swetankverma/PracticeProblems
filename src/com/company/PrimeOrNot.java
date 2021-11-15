package com.company;

public class PrimeOrNot {
    public static void main(String[] args) {
        int i, m=0,count=0;
        int n=7;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" Is not a Prime Number");
        }else {
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" Is no a Prime Number");
                    count =1;
                    break;
                }
            }
            if(count==0)
                System.out.println(n+" Is a Prime Number");
        }
    }
}