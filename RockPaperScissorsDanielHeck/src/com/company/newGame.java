package com.company;

import java.util.Random;
import java.util.Scanner;

public class newGame {
    public newGame() {
    }

    public int playGame() {
        boolean validMove = false;
        while (!validMove) {
            System.out.println("Which do you choose?  To stop playing, type 'quit'");
            System.out.println("r = rock");
            System.out.println("p = paper");
            System.out.println("s = scissors");
            System.out.println("q = quit");
            Scanner moveScan = new Scanner(System.in);
            String[] moveList = {"rock", "paper", "scissors"};
            String computerMove = moveList[new Random().nextInt(moveList.length)];
            String playerMove = moveScan.nextLine();
            if (playerMove.equals("q")) {
                return 2;
            }
            else if (playerMove.equals("r")) {
                validMove = true;
                if (computerMove.equals("rock")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("We cancelled each other out!");
                    return 0;
                }
                if (computerMove.equals("paper")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("Paper covers rock!  Haha!  I win!");
                    return -1;
                }
                if (computerMove.equals("scissors")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("Rock smashes scissors.  You win!  Darn it.");
                    return 1;
                }
            }
            else if (playerMove.equals("p")) {
                validMove = true;
                if (computerMove.equals("rock")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("Paper covers rock.  You win!  Darn it.");
                    return 1;
                }
                if (computerMove.equals("paper")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("We cancelled each other out!");
                    return 0;
                }
                if (computerMove.equals("scissors")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("Scissors cuts paper!  Haha!  I win!");
                    return -1;
                }
            }
            else if (playerMove.equals("s")) {
                validMove = true;
                if (computerMove.equals("rock")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("Rock smashes scissors!  Haha!  I win!");
                    return -1;
                }
                if (computerMove.equals("paper")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("Scissors cuts paper.  You win!  Darn it.");
                    return 1;
                }
                if (computerMove.equals("scissors")) {
                    System.out.println("I chose " + computerMove + ".");
                    System.out.println("We cancelled each other out!");
                    return 0;
                }
            }
            else {
                System.out.println("Please enter a valid choice.");
            }
        }
        return 0;
    }

    public void displayScore(int pScore, int cScore) {
        System.out.println("Your score: " + pScore);
        System.out.println("My score: " + cScore);
    }
}
