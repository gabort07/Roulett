package Brainstorming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        String playerName;
        int wallet;

        System.out.println("Játékos:");
        /*System.out.println("Add meg a neved:");
        playerName=sc.next();
        System.out.println("Kezdő tőke:");
        wallet=sc.nextInt();*/

        // Player player1 = new Player(wallet,0,0,playerName );
        Player player1 = new Player(2000, 0, 0, "Adam");

        System.out.println(player1);


        ArrayList<Player> playersList = new ArrayList<>();
        playersList.add(player1);

        List<Integer> winnerNumbers = new ArrayList<>();
        Krupie krupie = new Krupie(1, 100, winnerNumbers, playersList);
        krupie.numbersOfPosition.put(Positions.RED,krupie.redSet);
        krupie.numbersOfPosition.put(Positions.BLACK,krupie.blackSet);
        krupie.numbersOfPosition.put(Positions.EVEN,krupie.evenSet);
        krupie.numbersOfPosition.put(Positions.ODD,krupie.oddSet);
        krupie.numbersOfPosition.put(Positions.FIRST_18,krupie.first18Set);
        krupie.numbersOfPosition.put(Positions.SECOND_18,krupie.second18Set);
        krupie.numbersOfPosition.put(Positions.FIRST_12,krupie.first12Set);
        krupie.numbersOfPosition.put(Positions.SECOND_12,krupie.second12Set);
        krupie.numbersOfPosition.put(Positions.THIRD_12,krupie.third12Set);
        krupie.numbersOfPosition.put(Positions.ORPHANS,krupie.orphansSet);
        krupie.numbersOfPosition.put(Positions.BIG_SERIES,krupie.bigSeriesSet);
        krupie.numbersOfPosition.put(Positions.SMALL_SERIES,krupie.smallSeriesSet);
        krupie.numbersOfPosition.put(Positions.ZERO_NEIGHBORS,krupie.zeroNeighborsSet);
        krupie.numbersOfPosition.put(Positions.FIRST_COLLUM,krupie.firstCollumSet);
        krupie.numbersOfPosition.put(Positions.SECOND_COLLUM,krupie.secondCollumSet);
        krupie.numbersOfPosition.put(Positions.THIRD_COLLUM,krupie.thirdCollumSet);

        System.out.println("Játékos: ");
        /*System.out.println("Add meg a neved:");
        playerName=sc.next();
        System.out.println("Kezdő tőke:");
        wallet=sc.nextInt();*/

        // Player player2 = new Player(wallet,0,0,playerName );
        Player player2 = new Player(1000, 0, 0, "Gábor");

        System.out.println("player2: " + player2);

        krupie.playersListAtThisTable.add(player2);

        System.out.println("Krupié játékoslista: " + krupie.playersListAtThisTable);

        // *****

        krupie.rollANumber();
        krupie.showWinNumbers();

        krupie.askBets();

        int lastWinNum = krupie.rollANumber();
        System.out.println("Nyerő szám: "+ lastWinNum);

        krupie.payBets(lastWinNum);





    }
}
