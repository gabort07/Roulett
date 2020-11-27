package Roulett;

public class Main {

    public static void main(String[] args) {

        Player pisti = new Player(1000);
        Casino casino = new Casino(pisti);
//        casino.chooseCasinoGame();
        pisti.doubleColorStrategy(new RouletteTable(), "Red");

    }
}
