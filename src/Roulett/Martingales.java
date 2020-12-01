package Roulett;

public class Martingales extends Player {

    Splitting color;


    public Martingales(int minBet, int maxBet) {
        super(minBet, maxBet);
    }

    public Martingales(int budget, int minBet, int maxBet, String color) {
        super(budget, minBet, maxBet);
        if (color.equals("piros")) {
            this.color = Splitting.RED;
        } else if (color.equals("fekete")) {
            this.color = Splitting.BLACK;
        }
    }

    @Override
    public void makeBet() {
        int playerPot;
        if (getPlayerBets().size() == 0) {
            playerPot = getTableMinBet();
        } else {
            playerPot = getPlayerBets().get(getPlayerBets().size() - 1).getBetAmount() * 2;
        }

        if (getBudget() > 0) {
            System.out.println("Az egyenlege: " + getBudget() + " A tét: " + playerPot);
            if (playerPot <= getTableMaxBet() / 2) {
                getPlayerBets().add(new Bet(playerPot, color));
            } else {
                getPlayerBets().add(new Bet(playerPot, color));
            }

        } else {
            System.out.println("Önnek üres a péztárzája");
        }
    }

    @Override
    public String toString() {
        return "Martingales " + this.color;
    }
}
