package Roulett;

import java.util.Scanner;

public class Casino {

    RouletteTable rouletteTable;

    public Casino() {
        rouletteTable = new RouletteTable();
    }

    public void uG() {
        System.out.println("Milyen játékot szeretne játszni? \n" + "a) - Rulett");
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("a")) {
            rouletteTable = new RouletteTable();
            realOrSimulation();
            sc.close();
        }

    }


    public void realOrSimulation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valódi játékot (a), vagy simulációt (b) szeretne futtatni?");
        if (sc.next().equals("b")) {
            simulation();
        }
    }


    public void simulation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("A szimulációt választotta.");
        System.out.println("Melyik stratégiát választja? \n" + " 1 - Szín duplázó");
        int stgy = sc.nextInt();
        if (stgy == 1) {
            System.out.println("Szín duplázó statégiát választotta.");
            System.out.println("Melyik színnel játszunk? piros/fekete");
            Martingele laci = new Martingele(10000, sc.next());
            System.out.println("Hány körös szimulációt futtassunk?");
            int rounds = sc.nextInt();
            int sumOfWin = 0;
            for (int i = 0; i < rounds; i++) {
                laci.strategy(this);
                sumOfWin += laci.getBudget();
            }
            System.out.println(rounds + " szimuláció végeredménye: " + sumOfWin);
        }

//    public void realGame(RouletteTable rouletteTable, Player player);

    }
}

