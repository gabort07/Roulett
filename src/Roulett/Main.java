package Roulett;

public class Main {

    public static void main(String[] args) {

        DoubleColorPlayer pisti = new DoubleColorPlayer(1000,"Red");
        Casino casino = new Casino();
        pisti.strategy(new RouletteTable());

    }
}
