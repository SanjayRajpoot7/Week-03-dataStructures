package SampleProblem_StacksAndQueues.CircularTourProblem;

public class CircularTour {

    // Function to find the starting point of the circular tour
    public static int findStart(int[] petrol, int[] distance, int n) {
        int start = 0;      // The starting pump
        int currentPetrol = 0;  // Current petrol we have while traveling
        int totalPetrol = 0;    // Total petrol available in the journey
        int totalDistance = 0;  // Total distance we need to travel

        // Traverse the entire array to calculate the total petrol and total distance
        for (int i = 0; i < n; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];

            // Keep track of the current petrol
            currentPetrol += petrol[i] - distance[i];

            // If current petrol is less than 0, we cannot start from the current 'start'
            // So, reset the start point to the next pump
            if (currentPetrol < 0) {
                start = i + 1;  // Move the start point to the next pump
                currentPetrol = 0;  // Reset current petrol for the next attempt
            }
        }

        // If total petrol is greater than or equal to total distance, return the start index
        // Otherwise, no valid tour is possible
        return (totalPetrol >= totalDistance) ? start : -1;

    }
}
