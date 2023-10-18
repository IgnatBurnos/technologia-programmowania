package org.example;

public class Main {
    public static void main(String[] args) {
        int boardSize = 44;
        int numPlayers = 2;
        String[] playerNames = { "Player a", "Player b" };

        Game game = new Game(boardSize, playerNames);
        game.play();
    }
}
