package Roulett;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RouletteTable {
    private final int MAX_POT = 1000;
    private final int MIN_POT = 20;
    private int playerPot;

    private ArrayList<Player> playersList;
    private HashMap<Integer, ArrayList<Splitting>> table= new HashMap<>();


    public RouletteTable() {
        playersList = new ArrayList<>();
        for (Splitting actual : Splitting.values()) {
            for (int i : defineSplitting(actual)) {
              table.putIfAbsent(i, new ArrayList<>());
              table.get(i).add(actual);
            }
        }
        System.out.println(table);
    }

    public int[] defineSplitting(Splitting actual) {
        int[] numbers = new int[0];
        switch (actual) {
            case GREEN:
                numbers = new int[]{0};
                break;
            case RED:
                numbers = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
                break;
            case BLACk:
                numbers = new int[]{2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
                break;
            case EVEN:
                numbers = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
                break;
            case ODD:
                numbers = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
                break;
            case BIG_SERIES:
                numbers = new int[]{0, 2, 3, 4, 7, 12, 15, 18, 21, 19, 22, 32, 35};
                break;
            case SMALL_SERIES:
                numbers = new int[]{5, 8, 10, 11, 13, 16, 23, 24, 27, 30, 33, 36};
                break;
            case FIRST_18:
                numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
                break;
            case SECOND_18:
                numbers = new int[]{19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
                break;
            case FIRST_12:
                numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
                break;
            case SECOND_12:
                numbers = new int[]{13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
                break;
            case THIRD_12:
                numbers = new int[]{25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
                break;
            case ORPHANS:
                numbers = new int[]{1, 6, 9, 14, 17, 20, 31, 34};
                break;
            case FIRST_COLLUM:
                numbers = new int[]{1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};
                break;
            case SECOND_COLLUM:
                numbers = new int[]{2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35};
                break;
            case THIRD_COLLUM:
                numbers = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
                break;
            case ZERO_NEIGHBORS:
                numbers = new int[]{0, 3, 12, 15, 26, 32, 35};
        }
        return numbers;

    }


    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }

    public int getPlayerPot() {
        return playerPot;
    }

    public void setPlayerPot(int playerPot) {
        this.playerPot = playerPot;
    }

    public int getMIN_POT() {
        return MIN_POT;
    }

    public int getMAX_POT() {
        return MAX_POT;
    }

    public HashMap<Integer, ArrayList<Splitting>> getTable() {
        return table;
    }

    public int spinTheWheel() {
        return (int) (Math.random() * 36);

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
            System.out.println("Melyik színnel játszunk? Piros/Fekete");
            DoubleColorPlayer laci = new DoubleColorPlayer(10000, sc.next());
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