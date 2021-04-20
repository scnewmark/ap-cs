package com.labs.tasking;

public class Tasking {
    public static void mission() {
         System.out.println("The Liberal Arts and Science Academy cultivates responsible leaders, problem solvers, and thinkers by offering a nationally recognized, rigorous, innovative, evolving curriculum.\n");
     }
     public static void main(String[] args) {
         System.out.println("Running main() in Tasking class!\n");
         System.out.println("Trying mission()");
         mission();
 
         System.out.println("Trying favorite()");
         int nbr1 = Task.favorite();
         int nbr2 = Task.favorite();
         System.out.println("nbr1=" + nbr1);
         System.out.println("nbr1=" + nbr2 + "\n");
 
         System.out.println("Trying wasted()");
         double dpm = 3.75;
         int days = 30;
         System.out.println("A faucet with " + dpm + " drips per minute over " + days + " days will waste " + Task.wasted(dpm, days) + " gallons of water.");
         dpm = 7.50;
         days = 5;
         System.out.println("A faucet with " + dpm + " drips per minute over " + days + " days will waste " + Task.wasted(dpm, days) + " gallons of water.\n");
 
         System.out.println("Trying count()");
         System.out.println("Task.count(1.5,0.9,500): " + Task.count(1.5, 0.9, 500) + " beans");
         System.out.println("Task.count(2.0,1.0,25): " + Task.count(2.0, 1.0, 25) + " beans");
         Task.count(2.0, 1.0, 25);
 
     }
 }