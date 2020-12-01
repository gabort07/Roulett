package Roulett;

import java.util.ArrayList;

public abstract class  Player {
    private int budget;

    public Player() {
        this.budget = 10000;
    }

    public Player(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void addWin(int prise) {
        budget += prise;
    }

    public void addLoose(int loss) {
        budget -= loss;
    }

    public abstract Bet makeBet(ArrayList<Integer> winnerNumbers);

}