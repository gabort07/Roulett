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
}
