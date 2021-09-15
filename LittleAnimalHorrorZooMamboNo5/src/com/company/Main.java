package com.company;

public class Main {

    public static void main(String[] args) {

        //Make rabbit and snake object from Animal class
        Animal rabbit = new Animal("Rabbit", 3, 3);
        Animal snake = new Animal("Snake", 9, 9);


        //Welcome message
        System.out.println("Welcome to the Animal Horror Zoo Demo!\n");

        //Prints animals starting points
        rabbit.print();
        snake.print();

        boolean nextTo = false;

        //Does loop once, if nextTo is false, does it again until nexTo is true
        do {
            //Rabbit moves and prints it
            rabbit.moveDownAndRight();

            //Checks if rabbit and snakes are next to each other, if yes calls printEnding method, sets boolean nextTo to true
            if (snake.getX() - rabbit.getX() == 1) {
                System.out.println("I'm the rabbit please don't eat me!");
                rabbit.printEnding(snake);
                nextTo = true;

            } else {
                //Snake moves and prints it
                snake.moveUpAndLeft();
            }
        }
        while (!nextTo);
    }
}
