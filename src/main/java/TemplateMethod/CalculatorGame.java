package TemplateMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorGame extends Game {
    private int numberOfPlayers;
    private int[] scores;
    private int totalRounds;
    private int currentRound = 0;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        totalRounds = 5;
        scores = new int[numberOfPlayers];
        System.out.println("Welcome to the Calculator Game!");
    }

    @Override
    public boolean endOfGame() {
        return currentRound == totalRounds * numberOfPlayers;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("Player " + (player + 1) + ". It's your turn.");
        Questions question = new Questions();
        int result = scanner.nextInt();

        if (question.checkAnswer(result)) {
            System.out.println("Correct!");
            scores[player]++;
        } else {
            System.out.println("Incorrect!");
        }
        currentRound++;
    }

    @Override
    public void displayWinner() {
        int maxScore = 0;
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }

        List<Integer> winners = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                winners.add(i + 1);
            }
        }

        // Display the result
        if (winners.size() == 1) {
            System.out.println("Player " + winners.get(0) + " wins with " + maxScore + " points!");
        } else {
            System.out.print("It's a draw! Players ");
            for (int i = 0; i < winners.size(); i++) {
                System.out.print(winners.get(i));
                if (i < winners.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" are tied with " + maxScore + " points!");
        }
    }
}
