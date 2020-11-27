package Roulett;

import java.util.Scanner;

public class Casino {

    RouletteTable rouletteTable;

    public Casino() {
        rouletteTable = new RouletteTable();
    }

    public void chooseCasinoGame() {
        System.out.println("Milyen játékot szeretne játszni? \n" + "a) - Rulett");
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("a")) {
            rouletteTable = new RouletteTable();
        }
        System.out.println("Valódi játékot (a), vagy simulációt(b) szeretne futtatni?");
        if (sc.next().equals("b")) {
            System.out.println("Szimulációt választotta. Hány szimlációt futtassunk?");
            int rounds = sc.nextInt();
            System.out.println("Melyik stratégiát választja? \n" + " 1 - Szín duplázó");
            int stgy = sc.nextInt();
            if (stgy == 1) {
                System.out.println("Szín duplázó statégiát választotta.");
//                simulation(rounds, );
            }

        }

    }

//    public void simulation(int numberOFSpins, Player player){

//    }

//    public void realGame(RouletteTable rouletteTable, Player player);

}
