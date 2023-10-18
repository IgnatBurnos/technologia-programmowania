package org.example;

public class Main {
    public static void main(String[] args) {
        int boardSize = 44;
        int numPlayers = 2;
        String[] playerNames = { "Player 232", "Player 6662" };

        Game game = new Game(boardSize, playerNames);
        game.play();
    }
}
