package com.labs;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(fun(7));
    }

    public static int fun(int x){
        if(x < 4)
            return 5;
        return x+fun(x-1)+fun(x-3);
    }
}