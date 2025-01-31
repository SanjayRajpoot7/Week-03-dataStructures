package QuickSort.SortProductPrices;

public class Main {

    public static void main(String[] args) {
        SortProductPrices sortProductPrices = new SortProductPrices();
        double[] productPrices = {45,23,12,22.2,56,1.22};

        System.out.println("Original product prices:");
        sortProductPrices.printArray(productPrices);

        // Perform Quick Sort
        sortProductPrices.quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted product prices (ascending order):");
        sortProductPrices.printArray(productPrices);
    }

}
