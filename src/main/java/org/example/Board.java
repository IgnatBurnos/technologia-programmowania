package org.example;

public class Board {
    private int size;
    public Board(int size){
        this.size = size;
    }
    public boolean isWinner(Player player){
        return player.getPosition() >= size;
    }
}

