package com.gla.WrapperLvl2;
public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {150, null, 200, null, 350, 100, null};

        int notPlayed = 0;
        int totalScore = 0;

        for (Integer score : scores) {
            if (score == null) {
                notPlayed++;
            } else {
                totalScore += score;
            }
        }

        System.out.println("Players who haven't played: " + notPlayed);
        System.out.println("Total valid score: " + totalScore);
    }
}
