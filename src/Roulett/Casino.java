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
            rouletteTable.realOrSimulation();
            sc.close();
        }

    }
}

