package Roulett;

public interface CasinoGames {
    public void startGame(Casino game);

    public void simulation(int numbOfSpins);

    public void realGame(RouletteTable rouletteTable, Player player);

}
