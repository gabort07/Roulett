package Roulett;

import java.util.ArrayList;
import java.util.HashMap;

public class RouletteTable {
    private final int MAX_POT = 1000;
    private final int MIN_POT = 20;
    private ArrayList<Integer> winnerNumbers = new ArrayList<>();
    private int playerPot;
    private HashMap<Player, ArrayList<Bet>> betHashMap = new HashMap<>();
    private ArrayList<Player> playersList = new ArrayList<>();
    private HashMap<Integer, ArrayList<Splitting>> tableMap = new HashMap<>();


    public RouletteTable() {
        for (Splitting actual : Splitting.values()) {
            for (int i : defineSplitting(actual)) {
                tableMap.putIfAbsent(i, new ArrayList<>());
                tableMap.get(i).add(actual);
            }
        }

//        System.out.println(tableMap);
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
            case BLACK:
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

    public HashMap<Integer, ArrayList<Splitting>> getTableMap() {
        return tableMap;
    }

    public int spinTheWheel() {
        int a = (int) (Math.random() * 37);
        winnerNumbers.add(a);
        return a;
    }

    public void askBet(boolean win) {
        for (Player actualPlayer : playersList) {
            actualPlayer.makeBet(win);
            Bet actualBet = actualPlayer.getPlayerBets().get(actualPlayer.getPlayerBets().size() - 1);
            betHashMap.putIfAbsent(actualPlayer, new ArrayList<>());
            betHashMap.get(actualPlayer).add(actualBet);
            System.out.println("Player " + actualPlayer + " Player's bet: " + actualBet.betAmount +
                    " összeg a " + actualBet.betPosition + " pozícióra");
        }
    }

    public void play() {
        boolean win = false;
        int winAmount = 0;
        askBet(win);
        System.out.print("A nyerőszám: " + spinTheWheel() + " ");
        checkAndPayBets(win);

    }

    public void checkAndPayBets(boolean win) {
        for (Player actualPlayer : playersList) {
            int lastWinnerPosition = winnerNumbers.get(winnerNumbers.size() - 1);
            int playerBetAmount = actualPlayer.getPlayerBets().get(actualPlayer.getPlayerBets().size() - 1).getBetAmount();
            Splitting playerBetPosition = actualPlayer.getPlayerBets().get(actualPlayer.getPlayerBets().size() - 1).getBetPosition();
            if (tableMap.get(lastWinnerPosition).contains(playerBetPosition)) {
                win = true;
                System.out.println("  Nyert: \n");
                actualPlayer.addWin(calculatePrise(playerBetAmount, playerBetPosition));

            } else {
                win = false;
                actualPlayer.addLoose();
            }
        }
    }

    public double calculatePrise(int amount, Splitting position) {
        return amount + amount * position.getMultiplier();
    }
}