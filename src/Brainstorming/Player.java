package Brainstorming;

import java.util.ArrayList;

public class Player extends Strategy {
    String playerName;



    public Player(int wallet, int sumOfIncome, int lastWonMone, int hand, ArrayList<Integer> lastWinnerNumbers, String playerName) {
        super(wallet, sumOfIncome, lastWonMone, hand, lastWinnerNumbers);
        this.playerName = playerName;
    }

    @Override
    public void makeBets() {
        super.makeBets();
    }
}
