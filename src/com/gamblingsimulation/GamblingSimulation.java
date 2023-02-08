package com.gamblingsimulation;
/*Making a bet with $1*/
public class GamblingSimulation {
    public static final int EveryDayStake = 100;    //Initializing static variable
    public static final int betEveryGame = 1;      //Initializing static variable
    public static void main(String[] args) {
        System.out.println("Welcome To Gambling Simulator Program");
        int random = (int) Math.floor(Math.random()*10) % 2;
        if (random == betEveryGame){                           //Checking if the gambler won the bet
            System.out.println("You won the game");
        }
        else{
            System.out.println("You lost the game");
        }
    }
}