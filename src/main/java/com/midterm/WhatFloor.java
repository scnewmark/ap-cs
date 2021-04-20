package com.midterm;

public class WhatFloor {
    public static int whatFloor(String str) {
        int up = 0;
        int down = 0;
        for (char i: str.toCharArray()) {
            switch (i) {
                case '(':
                    up++;
                    break;
                case ')':
                    down++;
                    break;
            }
        }
        return up - down;
    }
    public static void main(String[] args) {
        System.out.print(whatFloor("())"));
    }
}
