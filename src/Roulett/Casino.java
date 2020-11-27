package Roulett;

import java.util.Scanner;

public class Casino {

    CasinoGames game;
    Player player;

    public Casino(Player player) {
        this.player = player;
    }

    public void chooseCasinoGame() {
        System.out.println("Milyen játékot szeretne játszni? \n" + "a) - Rulett");
        Scanner sc = new Scanner(System.in);
        String game = sc.next();
        if (game.equals("a")) {
            this.game = new RouletteTable();
        }
        System.out.println();

    }



}
