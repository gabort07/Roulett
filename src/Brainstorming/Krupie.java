package Brainstorming;

import java.util.*;

public class Krupie {
    int minimuCostOfOneBet;
    int maximuCostOfBets;
    List<Integer> lastWinnerNumbers;
    ArrayList<Player> playersListAtThisTable;

    Set<Integer> redSet = Set.<Integer>of(1, 3, 5, 7, 9, 11, 13, 15, 17, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36);
    Set<Integer> blackSet = Set.<Integer>of(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35);
    Set<Integer> evenSet = Set.<Integer>of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36);
    Set<Integer> oddSet = Set.<Integer>of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35);
    Set<Integer> bigSeriesSet = Set.<Integer>of(0, 2, 3, 4, 7, 12, 15, 18, 21, 19, 22, 32, 35);
    Set<Integer> smallSeriesSet = Set.<Integer>of(5, 8, 10, 11, 13, 16, 23, 24, 27, 30, 33, 36);
    Set<Integer> orphansSet = Set.<Integer>of(1, 6, 9, 14, 17, 20, 31, 34);
    Set<Integer> zeroNeighborsSet = Set.<Integer>of(0, 3, 12, 15, 26, 32, 35);
    Set<Integer> first18Set = Set.<Integer>of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
    Set<Integer> second18Set = Set.<Integer>of(19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36);
    Set<Integer> first12Set = Set.<Integer>of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    Set<Integer> second12Set = Set.<Integer>of(13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
    Set<Integer> third12Set = Set.<Integer>of(25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36);
    Set<Integer> firstCollumSet = Set.<Integer>of(1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34);
    Set<Integer> secondCollumSet = Set.<Integer>of(2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35);
    Set<Integer> thirdCollumSet = Set.<Integer>of(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36);

    HashMap<Positions,Set<Integer>> numbersOfPosition = new HashMap<>();


    public Krupie(int minimuCostOfOneBet, int maximuCostOfBets, List<Integer> lastWinnerNumbers,
                  ArrayList<Player> playersListAtThisTable) {
        this.minimuCostOfOneBet = minimuCostOfOneBet;
        this.maximuCostOfBets = maximuCostOfBets;
        this.lastWinnerNumbers = lastWinnerNumbers;
        this.playersListAtThisTable = playersListAtThisTable;
    }

    public int payBets(Integer lastWinNum) {
        int winnerCash = 0;

        for (Player player:playersListAtThisTable) {

            if (numbersOfPosition.get(player.myBet.position).contains(lastWinNum)  ){
                System.out.println("Nyert");
            }
        }

        return winnerCash;
    }

    public int rollANumber() {
        int number = (int) (Math.random() * 37);
        lastWinnerNumbers.add(number);
        return number;
    }

    public void askBets() {
        for (Player player:playersListAtThisTable) {
            player.makeBets(lastWinnerNumbers);
            System.out.println("Player: "+player+ " Player's bet: "+ player.myBet);

        }

    }

    public void showWinNumbers(){
        System.out.print("Winer numbers: ");
        for (Integer num:lastWinnerNumbers ) {
            System.out.print(" : "+num);
        }
    }

    public int getMinimuCostOfOneBet() {
        return minimuCostOfOneBet;
    }

    public void setMinimuCostOfOneBet(int minimuCostOfOneBet) {
        this.minimuCostOfOneBet = minimuCostOfOneBet;
    }

    public int getMaximuCostOfBets() {
        return maximuCostOfBets;
    }

    public void setMaximuCostOfBets(int maximuCostOfBets) {
        this.maximuCostOfBets = maximuCostOfBets;
    }

    public List<Integer> getLastWinnerNumbers() {
        return lastWinnerNumbers;
    }

    public void setLastWinnerNumbers(List<Integer> lastWinnerNumbers) {
        this.lastWinnerNumbers = lastWinnerNumbers;
    }

    public ArrayList<Player> getPlayersListAtThisTable() {
        return playersListAtThisTable;
    }

    public void setPlayersListAtThisTable(ArrayList<Player> playersListAtThisTable) {
        this.playersListAtThisTable = playersListAtThisTable;
    }

    @Override
    public String toString() {
        return "Krupie{" +
                "minimuCostOfOneBet=" + minimuCostOfOneBet +
                ", maximuCostOfBets=" + maximuCostOfBets +
                ", lastWinnerNumbers=" + lastWinnerNumbers +
                ", playersListAtThisTable=" + playersListAtThisTable +
                '}';
    }
}
