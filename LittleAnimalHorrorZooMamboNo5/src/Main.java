public class Main {

    public static void main(String[] args) {

        //Make rabbit and snake object from Animal class
        Animal rabbit = new Animal("Rabbit", 1, 1);
        Animal snake = new Animal("Snake", 9, 9);

        //Welcome message
        System.out.println("--------------------------------------");
        System.out.println("Welcome to the Animal Horror Zoo Demo!");
        System.out.println("--------------------------------------");

        //Prints animals starting points and Round 0
        int round = 0;
        System.out.println("Round: " + round);
        rabbit.print();
        snake.print();

        boolean nextTo = false;

        //Does loop once, if nextTo is false, 12 does it again until nexTo is true
        do {
            round++;
            System.out.println("Round: " + round);
            //Rabbit moves and print
            rabbit.moveDownAndRight();

            //Checks if rabbit and snakes are next to each other, if yes calls printEnding method, sets boolean nextTo to true
            if (snake.getX() - rabbit.getX() == 1) {
                System.out.println("I'm the rabbit, please don't eat me!");
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
