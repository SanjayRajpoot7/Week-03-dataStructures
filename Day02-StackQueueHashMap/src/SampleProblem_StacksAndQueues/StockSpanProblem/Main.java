package SampleProblem_StacksAndQueues.StockSpanProblem;

public class Main {
    public static void main(String[] args) {
        StockSpan stockSpan = new StockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = stockSpan.calculateSpan(prices);

        System.out.println("Stock Prices: " + java.util.Arrays.toString(prices));
        System.out.println("Stock Spans:  " + java.util.Arrays.toString(spans));
    }
}

