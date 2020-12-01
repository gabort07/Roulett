package Roulett;

import java.util.ArrayList;

public class Martingele extends Player {

    private String color;
    private ArrayList<Bet> bets;

    public Martingele() {
    }

    public Martingele(int budget, String color) {
        super(budget);
        this.color = color;
    }

    @Override
    public Bet makeBet(ArrayList<Integer> winnerNumbers) {
        int playerPot = minPot;
        while (getBudget() > 0) {
            System.out.println("Az egyenlege: " + getBudget() + " A tét: " + playerPot);
            if (this.color.equals(color)) {
                addWin(playerPot * 2);
                System.out.println("Ön nyert! A nyeremény: " + playerPot * 2 + " egynlege: " + getBudget());
                break;
            } else if (playerPot == maxPot) {
                System.out.println("Ön maximális tétet tett és vesztett. " + playerPot + " öszzeget vesztett");
                addLoose(playerPot);
            } else {
                System.out.println("Ön vesztett, a tét duplázódik!");
                addLoose(playerPot);
                playerPot *= 2;
            }
        }
    }

}

