package Roulett;

public class DoubleColorPlayer extends Player{

    private String color;

    public DoubleColorPlayer() {
    }

    public DoubleColorPlayer(int budget, String color) {
        super(budget);
        this.color = color;
    }

    @Override
    public void strategy(RouletteTable rouletteTable) {
        int playerPot = rouletteTable.getMIN_POT();
//        while (getBudget() > 0) {
//            System.out.println("Az egyenlege: " + getBudget() + " A tét: " + playerPot);
//            String fieldColor = rouletteTable.spinTheWheel();
//            if (fieldColor.equals(color)) {
//                addWin(playerPot * 2);
//                System.out.println("Ön nyert! A nyeremény: " + playerPot * 2 + " egynlege: " + getBudget());
//                break;
//            } else if (playerPot == rouletteTable.getMAX_POT()) {
//                System.out.println("Ön maximális tétet tett és vesztett. " + playerPot + " öszzeget vesztett");
//                addLoose(playerPot);
//            } else {
//                System.out.println("Ön vesztett, a tét duplázódik!");
//                addLoose(playerPot);
//                playerPot *= 2;
//            }
//        }
    }

}

