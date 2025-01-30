package SampleProblem_StacksAndQueues.CircularTourProblem;

public class Main {
    public static void main(String[] args) {
        CircularTour circularTour = new CircularTour();
        // Example: Array of petrol amounts and distances to the next pump
        int[] petrol = {4, 6, 7, 4};        // Petrol at each pump
        int[] distance = {6, 5, 3, 5};      // Distance to the next pump
        int n = petrol.length;              // Number of petrol pumps

        // Find the starting pump index for the circular tour
        int start = circularTour.findStart(petrol, distance, n);

        if (start == -1) {
            System.out.println("No valid circular tour exists.");
        } else {
            System.out.println("The starting pump index is: " + start);
        }
    }

}
