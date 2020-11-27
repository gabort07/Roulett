package Roulett;

import java.util.ArrayList;

public class RouletteTable {
    private final int MAX_POT = 1000000;
    private ArrayList<String> table = new ArrayList<>();

    public RouletteTable() {
        table.add(0, "Green");
        table.add(1, "Red");
        table.add(2, "Black");
        table.add(3, "Red");
        table.add(4, "Black");
        table.add(5, "Red");
        table.add(6, "Black");
        table.add(7, "Red");
        table.add(8, "Black");
        table.add(9, "Red");
        table.add(10, "Black");
        table.add(11, "Black");
        table.add(12, "Red");
        table.add(13, "Black");
        table.add(14, "Red");
        table.add(15, "Black");
        table.add(16, "Red");
        table.add(17, "Black");
        table.add(18, "Red");
        table.add(19, "Red");
        table.add(20, "Black");
        table.add(21, "Red");
        table.add(22, "Black");
        table.add(23, "Red");
        table.add(24, "Black");
        table.add(25, "Red");
        table.add(26, "Black");
        table.add(27, "Red");
        table.add(28, "Black");
        table.add(29, "Black");
        table.add(30, "Red");
        table.add(31, "Black");
        table.add(32, "Red");
        table.add(33, "Black");
        table.add(34, "Red");
        table.add(35, "Black");
        table.add(36, "Red");
    }


    public int spinTheWheel() {
        return (int) (Math.random() * 36);
    }
}