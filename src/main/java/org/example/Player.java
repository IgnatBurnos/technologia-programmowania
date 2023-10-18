package org.example;

public class Player {
    private String name;
    public int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void move(int steps) {
        position += steps;
    }
}
