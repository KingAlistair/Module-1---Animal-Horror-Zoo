package com.company;

public class Animal {
    private String name;
    private int x;
    private int y;

    //Constructor
    public Animal(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    //Getters and Setter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Method: "Moves" animal x+1, y+1 location
    public void moveDownAndRight() {
        setX(getX() + 1);
        setY((getY() + 1));
        print();
    }

    //Method: "Moves" animal x-1, y-1 location
    public void moveUpAndLeft() {
        setX(getX() - 1);
        setY((getY() - 1));
        print();
    }

    //Method: Prints out animal location
    public void print() {
        System.out.println("I'm the " + name + " and I'm on " + getX() + ", " + getY() + " position.");
    }

    public void printEnding(Animal snake) {
        snake.setX(getX());
        snake.setY(getY());
        System.out.println("I'm the " + snake.name + ". I'm on " + snake.getX() + ", " + snake.getY() + " position and I'm eating you now!");
    }
}

