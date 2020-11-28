package Brainstorming;

import java.util.ArrayList;

public class Bet {
    ArrayList<Integer> numbers;
    int cashflowOfThisBet;
    // A különböző pzíciók
    int even;
    int odd;
    int red;
    int black;
    int tiers;
    int orphelins;
    int voisins;
    int zerospiel;
    int firstDozen;
    int secondDozen;
    int thirdDozen;
    int modThreeRestZero;
    int modThreeRestOne;
    int modThreeRestTwo;
    int fistHalf;
    int secondHalf;
    String coditionOfThisBet;

    public Bet(ArrayList<Integer> numbers, int even, int odd, int red, int black, int tiers, int orphelins,
               int voisins, int zerospiel, int firstDozen, int secondDozen, int thirdDozen, int modThreeRestZero,
               int modThreeRestOne, int modThreeRestTwo, int fistHalf, int secondHalf, String coditionOfThisBet) {
        this.numbers = numbers;
        this.even = even;
        this.odd = odd;
        this.red = red;
        this.black = black;
        this.tiers = tiers;
        this.orphelins = orphelins;
        this.voisins = voisins;
        this.zerospiel = zerospiel;
        this.firstDozen = firstDozen;
        this.secondDozen = secondDozen;
        this.thirdDozen = thirdDozen;
        this.modThreeRestZero = modThreeRestZero;
        this.modThreeRestOne = modThreeRestOne;
        this.modThreeRestTwo = modThreeRestTwo;
        this.fistHalf = fistHalf;
        this.secondHalf = secondHalf;
        this.coditionOfThisBet = coditionOfThisBet;
        this.cashflowOfThisBet = even + odd + red + black + tiers + orphelins + voisins + zerospiel + firstDozen +
                secondDozen + thirdDozen + modThreeRestZero + modThreeRestOne + modThreeRestTwo + fistHalf + secondHalf;
    }

    public Bet() {
    }


}
