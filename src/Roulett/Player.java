package Roulett;

public class Player {
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

    public void doubleColorStrategy(RouletteTable rouletteTable, String color) {
        int playerPot = rouletteTable.getMIN_POT();
        while (budget > 0) {
            System.out.println("Az egyenlege: " + getBudget() + " A tét: " + playerPot);
            String fieldColor = rouletteTable.getTable().get(rouletteTable.spinTheWheel());
            if (fieldColor.equals(color)) {
                win(playerPot * 2);
                System.out.println("Ön nyert! A nyeremény: " + playerPot * 2 + " egynlege: " + getBudget());
                break;
            } else if (playerPot == rouletteTable.getMAX_POT()) {
                System.out.println("Ön maximális tétet tett és vesztett. " + playerPot + " öszzeget vesztett");
                loose(playerPot);
            } else {
                System.out.println("Ön vesztett, a tét duplázódik!");
                loose(playerPot);
                playerPot *= 2;
            }
        }
    }

}