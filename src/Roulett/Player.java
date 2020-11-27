package Roulett;

public abstract class Player implements Strategy {
    private int budget;

    public Player() {
    }

    public Player(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void win(int prise) {
        budget += prise;
    }

    public void loose(int loss) {
        budget -= loss;
    }


}