package com.labs.deal;

public class Deal {
    private int prizeLoc;
    private int userGuess;

    public Deal() {
        setPrizeLoc();
        setUserGuess();
    }

    public void setUserGuess() {
        userGuess = randomNum();
    }

    public void setPrizeLoc() {
        prizeLoc = randomNum();
    }

    public int getUserGuess() {
        return userGuess;
    }

    public int getPrizeLoc() {
        return prizeLoc;
    }

    public int randomNum() {
        return (int) Math.floor(Math.random() * 3) + 1;
    }

    @Override 
    public String toString() {
        return "user guess: " + userGuess + " prizeLoc: " + prizeLoc;
    }
}