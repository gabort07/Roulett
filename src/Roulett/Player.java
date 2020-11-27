package Roulett;

public class Player {
    private int budget;
    private int pot;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public void win(int prise) {
        budget += prise;
    }

    public void loose(int loss) {
        budget -= loss;
    }

    public void doubleColorStrategi(RouletteTable rouletteTable) {

    }
}
