package com.gla.forEachMethod;
import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<String> stockUpdates = Arrays.asList(
            "AAPL: $189.50",
            "GOOGL: $175.20",
            "MSFT: $420.10",
            "TSLA: $245.80",
            "AMZN: $198.60"
        );

        stockUpdates.forEach(stock -> System.out.println("Stock Update: " + stock));
    }
}
