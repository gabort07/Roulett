package Brainstorming;

import java.util.ArrayList;

public class Player extends Strategy {
    String playerName;



    public Player(int wallet, int sumOfIncome, int lastWonMoney, int hand, ArrayList<Integer> lastWinnerNumbers, String playerName) {
        super(wallet, sumOfIncome, lastWonMoney, hand, lastWinnerNumbers);
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public Bet makeBets() {
        int wallet = getWallet();
        super.makeBets();
    }
}
