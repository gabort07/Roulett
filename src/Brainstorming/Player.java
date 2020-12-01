package Brainstorming;

import java.util.ArrayList;
import java.util.List;

public class Player extends Strategy {
    String playerName;


    public Player(int wallet, int sumOfIncome, int lastWonMoney, String playerName) {
        super(wallet, sumOfIncome, lastWonMoney);
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", wallet=" + wallet +
                ", sumOfIncome=" + sumOfIncome +
                ", lastWonMoney=" + lastWonMoney +
                '}';
    }

    @Override
    public void makeBets(List<Integer> lastWinnerNumbers) {

        Bet myBet = new Bet(1, Positions.BLACK);
            this.myBet=myBet;
     //   int num = lastWinnerNumbers.get(lastWinnerNumbers.size() - 1);
       // Bet myBet2 = new Bet(1, Positions.N1);


    }


}
