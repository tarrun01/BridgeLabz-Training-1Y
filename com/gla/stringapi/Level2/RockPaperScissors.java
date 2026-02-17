package com.gla.stringapi.Level2;
import java.util.Scanner;

public class RockPaperScissors {
    
    // Method to get computer's choice
    public static String getComputerChoice() {
        int random = (int)(Math.random() * 3);
        
        if (random == 0) {
            return "rock";
        } else if (random == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
    
    // Method to find winner
    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "tie";
        }
        
        // rock-scissors: rock wins
        if (player.equals("rock") && computer.equals("scissors")) {
            return "player";
        }
        if (computer.equals("rock") && player.equals("scissors")) {
            return "computer";
        }
        
        // rock-paper: paper wins
        if (player.equals("paper") && computer.equals("rock")) {
            return "player";
        }
        if (computer.equals("paper") && player.equals("rock")) {
            return "computer";
        }
        
        // scissors-paper: scissors wins
        if (player.equals("scissors") && computer.equals("paper")) {
            return "player";
        }
        if (computer.equals("scissors") && player.equals("paper")) {
            return "computer";
        }
        
        return "tie";
    }
    
    // Method to calculate stats
    public static String[][] calculateStats(int playerWins, int computerWins, int ties, int totalGames) {
        String[][] stats = new String[3][2];
        
        double playerPercentage = (playerWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;
        double tiePercentage = (ties * 100.0) / totalGames;
        
        stats[0][0] = "Player";
        stats[0][1] = String.format("%.2f%%", playerPercentage);
        
        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f%%", computerPercentage);
        
        stats[2][0] = "Ties";
        stats[2][1] = String.format("%.2f%%", tiePercentage);
        
        return stats;
    }
    
    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats, int playerWins, int computerWins, int ties) {
        System.out.println("\n===== Game Results =====");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s%n", "Game", "Player", "Computer", "Winner");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10s %-15s %-15s %-15s%n", 
                (i + 1), gameResults[i][0], gameResults[i][1], gameResults[i][2]);
        }
        
        System.out.println("--------------------------------------------------------");
        
        // Display stats
        System.out.println("\n===== Statistics =====");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);
        
        System.out.println("\n===== Win Percentages =====");
        System.out.println("--------------------------------");
        System.out.printf("%-15s %-15s%n", "Participant", "Win %");
        System.out.println("--------------------------------");
        
        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-15s %-15s%n", stats[i][0], stats[i][1]);
        }
        
        System.out.println("--------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Rock-Paper-Scissors Game =====");
        System.out.print("\nEnter number of games to play: ");
        int numGames = sc.nextInt();
        
        String[][] gameResults = new String[numGames][3];
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;
        
        // Play games
        for (int i = 0; i < numGames; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.next().toLowerCase();
            
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            
            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            
            if (winner.equals("player")) {
                gameResults[i][2] = "Player";
                playerWins++;
            } else if (winner.equals("computer")) {
                gameResults[i][2] = "Computer";
                computerWins++;
            } else {
                gameResults[i][2] = "Tie";
                ties++;
            }
            
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + gameResults[i][2] + " wins!");
        }
        
        // Calculate stats
        String[][] stats = calculateStats(playerWins, computerWins, ties, numGames);
        
        // Display results
        displayResults(gameResults, stats, playerWins, computerWins, ties);
        
        sc.close();
    }
}
