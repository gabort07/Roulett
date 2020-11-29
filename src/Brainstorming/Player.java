package Brainstorming;

import java.util.ArrayList;

public class Player extends Strategy {
    String playerName;



    public Player(int wallet, int sumOfIncome, int lastWonMone, int hand, ArrayList<Integer> lastWinnerNumbers, String playerName) {
        super(wallet, sumOfIncome, lastWonMone, hand, lastWinnerNumbers);
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void makeBets() {
        int wallet = getWallet();
        super.makeBets();
    }
}
