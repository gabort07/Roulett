package Roulett;

import java.util.ArrayList;

public abstract class Player {
    private int budget;
    private int tableMinBet;
    private int tableMaxBet;
    private ArrayList<Bet> playerBets = new ArrayList<>();

    public ArrayList<Bet> getPlayerBets() {
        return playerBets;
    }

    public Player() {
    }

    public Player(int minBet, int maxBet) {
        this.budget = 10000;
        this.tableMinBet= minBet;
        this.tableMaxBet=maxBet;
    }

    public Player(int budget, int minBet, int maxBet) {
        this.budget = budget;
        this.tableMinBet = minBet;
        this.tableMaxBet = maxBet;
    }

    public int getBudget() {
        return budget;
    }

    public int getTableMinBet() {
        return tableMinBet;
    }

    public void setTableMinBet(int tableMinBet) {
        this.tableMinBet = tableMinBet;
    }

    public int getTableMaxBet() {
        return tableMaxBet;
    }

    public void setTableMaxBet(int tableMaxBet) {
        this.tableMaxBet = tableMaxBet;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void addWin(double prise) {
        budget += prise;
    }

    public void addLoose(int loss){
        budget -= loss;
    }

    public void addLoose() {
        int lastBet = playerBets.get(playerBets.size()-1).getBetAmount();
        budget -= lastBet;
    }

    public abstract void makeBet();

}