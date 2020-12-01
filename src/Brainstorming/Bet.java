package Brainstorming;

import Roulett.Splitting;

import java.util.ArrayList;

public class Bet {

    int amount;
    Positions position;


    public Bet(int amount, Positions position) {

        this.amount = amount;
        this.position = position;
    }


    @Override
    public String toString() {
        return "Bet{" +
                "amount=" + amount +
                ", position='" + position + '\'' +
                '}';
    }
}
