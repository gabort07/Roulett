package Roulett;

public class Bet {
    int betAmount;
    Splitting betPosition;

    public Bet(int amount, Splitting betPosition) {
        this.betAmount = amount;
        this.betPosition = betPosition;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public Splitting getBetPosition() {
        return betPosition;
    }
}
