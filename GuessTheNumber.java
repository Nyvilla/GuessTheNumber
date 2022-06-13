package genspark.projects;

import java.util.Scanner;

import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(20)+1;
        System.out.println("Random: "+randomNumber);

        int attempts = 3;

        System.out.println("I'm thinking of a number between 1 and 20.");
        System.out.println("Take a guess ");
        int guess = scanner.nextInt();
        if(guess >20 || guess < 1){
            System.out.println("Please try a number between 1 and 20.");
        }

        if(guess > attempts){
            System.out.println("Sorry you ran out of tries");
        }

    }

    public static class Game{
        public void startGame(){
            System.out.println("start");
        }
    }
}
