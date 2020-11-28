package Brainstorming;

import java.util.ArrayList;
import java.util.List;

public class Krupie {
    int minimuCostOfOneBet;
    int maximuCostOfBets;
    List<Integer> lastWinnerNumbers;
    ArrayList<Player> playersListAtThisTable;

    public Krupie(int minimuCostOfOneBet, int maximuCostOfBets, List<Integer> lastWinnerNumbers,
                  ArrayList<Player> playersListAtThisTable) {
        this.minimuCostOfOneBet = minimuCostOfOneBet;
        this.maximuCostOfBets = maximuCostOfBets;
        this.lastWinnerNumbers = lastWinnerNumbers;
        this.playersListAtThisTable = playersListAtThisTable;
    }

    public static int payTheBet(Bet playerBet) {
        int winnerCash = 0;
        return winnerCash;
    }

    public int rollANumber() {
        int number = (int) Math.random() * 37;
        return number;
    }

    public void askBets(Player player) {
    }
}
