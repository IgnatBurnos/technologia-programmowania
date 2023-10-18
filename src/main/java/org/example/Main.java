package org.example;

public class Main {
    public static void main(String[] args) {
        int boardSize = 44;
        int numPlayers = 2;
        String[] playerNames = { "Player b", "Player a" };

        Game game = new Game(boardSize, playerNames);
        game.play();
    }
}
