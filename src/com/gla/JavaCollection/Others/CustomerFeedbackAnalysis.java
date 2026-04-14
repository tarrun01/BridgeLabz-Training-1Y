package com.gla.JavaCollection.Others;
import java.util.*;

public class CustomerFeedbackAnalysis {

    public static void main(String[] args) {
        List<String> allFeedback = new ArrayList<>();
        Set<String> uniqueFeedback = new LinkedHashSet<>();
        Queue<String> processingQueue = new LinkedList<>();
        Stack<String> recentFeedback = new Stack<>();

        allFeedback.add("Great service!");
        allFeedback.add("Very helpful staff.");
        allFeedback.add("Great service!");
        allFeedback.add("Fast delivery.");
        allFeedback.add("Very helpful staff.");
        allFeedback.add("Will shop again.");
        allFeedback.add("Excellent quality.");

        System.out.println("All Feedback (with duplicates): " + allFeedback);

        for (String f : allFeedback) {
            if (uniqueFeedback.add(f)) {
                processingQueue.add(f);
            }
        }

        System.out.println("\nUnique Feedback Count: " + uniqueFeedback.size());

        System.out.println("\nProcessing Feedback in Order:");
        while (!processingQueue.isEmpty()) {
            String f = processingQueue.poll();
            recentFeedback.push(f);
            System.out.println("Processed: " + f);
        }

        System.out.println("\nLast 3 Feedbacks (most recent first):");
        int count = 0;
        Stack<String> temp = (Stack<String>) recentFeedback.clone();
        while (!temp.isEmpty() && count < 3) {
            System.out.println(" - " + temp.pop());
            count++;
        }
    }
}
