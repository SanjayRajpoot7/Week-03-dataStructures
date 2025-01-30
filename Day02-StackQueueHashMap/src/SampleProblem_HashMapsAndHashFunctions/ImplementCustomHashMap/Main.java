package SampleProblem_HashMapsAndHashFunctions.ImplementCustomHashMap;

public class Main {

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Inserting key-value pairs
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Retrieving values by key
        System.out.println("Value for key A: " + map.get("A"));  // Output: 1
        System.out.println("Value for key B: " + map.get("B"));  // Output: 2
        System.out.println("Value for key C: " + map.get("C"));  // Output: 3

        // Updating value for an existing key
        map.put("B", 20);
        System.out.println("Updated value for key B: " + map.get("B"));  // Output: 20

        // Removing a key-value pair
        map.remove("A");
        System.out.println("Value for key A after removal: " + map.get("A"));  // Output: null

        // Print the entire map for debugging
        map.printMap();
    }

}

