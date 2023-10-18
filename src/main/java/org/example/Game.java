package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;

    public Game(int boardSize, String[] playerNames){
        board = new Board(boardSize);
        players = new Player[playerNames.length];
        for ( int i = 0; i < playerNames.length; i++){
            players[i] = new Player(playerNames[i]);
        }
    }
    public int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
    public void play(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            for(Player player : players){
                System.out.println(player.getName() + " press Enter to roll the dice..");
                scanner.nextLine();

                int steps = rollDice();
                System.out.println(player.getName() + " rolled a dice");
                player.move(steps);
                System.out.println("Dice rolled - you get " + steps + "!!!!");
                System.out.println(player.getName() + " you moved on " + player.position + "'s square" );

                if (board.isWinner(player)){
                    System.out.println(player.getName()+ " winner");
                    return;
                }
            }
        }
    }

}
