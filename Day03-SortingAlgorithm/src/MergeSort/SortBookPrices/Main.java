package MergeSort.SortBookPrices;

public class Main {

    public static void main(String[] args) {
        SortBookPrices sortBookPrices = new SortBookPrices();
        double[] bookPrices = {45.99, 23.49, 89.99,23};

        System.out.println("Original book prices:");
        sortBookPrices.printArray(bookPrices);

        // Perform Merge Sort
        sortBookPrices.mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted book prices: ");
        sortBookPrices.printArray(bookPrices);
    }
}
