package com.company;

public class Main {

    public static void main(String[] args) {
        boolean noMoreGames = false;
        int compScore = 0;
        int playerScore = 0;
        System.out.println("Hello!  Let's play rock-paper-scissors.");
        while (!noMoreGames) {
            newGame nextGame = new newGame();
            int result = nextGame.playGame();
            if (result == 2) {
                noMoreGames = true;
                System.out.println("Thanks for playing!");
            }
            else if (result == 1) {
                playerScore++;
                nextGame.displayScore(playerScore, compScore);
            }
            else if (result == -1) {
                compScore++;
                nextGame.displayScore(playerScore, compScore);
            }
            else {
                nextGame.displayScore(playerScore, compScore);
            }
        }
    }
}
