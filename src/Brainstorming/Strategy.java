package Brainstorming;

import java.util.ArrayList;

public class Strategy {
    int wallet;
    int sumOfIncome;
    int lastWonMoney;
    int hand;
    ArrayList<Integer> lastWinnerNumbers;


    public Strategy() {
    }

    public void /* Bet */ makeBets(){};

    public Strategy(int wallet, int sumOfIncome, int lastWonMoney, int hand, ArrayList<Integer> lastWinnerNumbers) {
        this.wallet = wallet;
        this.sumOfIncome = sumOfIncome;
        this.lastWonMoney = lastWonMoney;
        this.hand = hand;
        this.lastWinnerNumbers = lastWinnerNumbers;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getSumOfIncome() {
        return sumOfIncome;
    }

    public void setSumOfIncome(int sumOfIncome) {
        this.sumOfIncome = sumOfIncome;
    }

    public int getLastWonMoney() {
        return lastWonMoney;
    }

    public void setLastWonMoney(int lastWonMoney) {
        this.lastWonMoney = lastWonMoney;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public ArrayList<Integer> getLastWinnerNumbers() {
        return lastWinnerNumbers;
    }

    public void setLastWinnerNumbers(ArrayList<Integer> lastWinnerNumbers) {
        this.lastWinnerNumbers = lastWinnerNumbers;
    }
}
