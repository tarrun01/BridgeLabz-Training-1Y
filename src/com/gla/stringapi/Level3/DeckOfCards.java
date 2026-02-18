package com.gla.stringapi.Level3;

import java.util.Scanner;

public class DeckOfCards {

    // Initialize deck with all cards as "rank of suit"
    static String[] initDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String suit : suits)
            for (String rank : ranks)
                deck[idx++] = rank + " of " + suit;
        return deck;
    }

    // Shuffle deck using Fisher-Yates algorithm
    static String[] shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i)); // random index from i to end
            String temp = deck[i]; deck[i] = deck[r]; deck[r] = temp; // swap
        }
        return deck;
    }

    // Distribute n cards evenly to x players
    static String[][] distribute(String[] deck, int n, int players) {
        if (n > deck.length || n % players != 0) {
            System.out.println("Cannot distribute " + n + " cards to " + players + " players evenly.");
            return null;
        }
        int cardsEach = n / players;
        String[][] result = new String[players][cardsEach];
        for (int i = 0; i < players; i++)
            for (int j = 0; j < cardsEach; j++)
                result[i][j] = deck[i * cardsEach + j];
        return result;
    }

    // Print each player's cards
    static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) System.out.print("[" + card + "] ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = shuffle(initDeck(suits, ranks));
        System.out.println("Deck shuffled! Total cards: " + deck.length);

        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[][] result = distribute(deck, n, players);
        if (result != null) printPlayers(result);
        sc.close();
    }
}
