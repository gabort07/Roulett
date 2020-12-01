package Brainstorming;

import java.util.ArrayList;
import java.util.List;

public abstract class Strategy {
    int wallet;
    int sumOfIncome;
    int lastWonMoney;
    Bet myBet;


    public Strategy() {
    }

    public Strategy(int wallet, int sumOfIncome, int lastWonMoney) {
        this.wallet = wallet;
        this.sumOfIncome = sumOfIncome;
        this.lastWonMoney = lastWonMoney;
    }


    public abstract void makeBets(List<Integer> lastWinnerNumbers);

}
