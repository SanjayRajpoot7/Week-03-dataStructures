package SampleProblem_HashMapsAndHashFunctions.ImplementCustomHashMap;

public class CustomHashMap<K,V> {

        private static final int SIZE = 10;  // Initial size of the hash map
        private Node<K, V>[] buckets;       // Array of linked lists for collision handling

        // Node class to represent key-value pairs
        static class Node<K, V> {
            K key;
            V value;
            Node<K, V> next;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

        // Constructor: Initialize buckets array
        public CustomHashMap() {
            buckets = new Node[SIZE];  // Initialize the array with the size
        }

        // Hash function: Convert key to an index in the array
        private int getBucketIndex(K key) {
            return Math.abs(key.hashCode() % SIZE);
        }

        // Put method: Insert or update key-value pair
        public void put(K key, V value) {
            int index = getBucketIndex(key);  // Get the index for the key
            Node<K, V> head = buckets[index]; // Get the linked list at this index

            // Traverse the linked list and check if key already exists
            while (head != null) {
                if (head.key.equals(key)) {
                    head.value = value; // Update value if key is found
                    return;
                }
                head = head.next;
            }

            // If key doesn't exist, create a new node and add it at the head of the list
            Node<K, V> newNode = new Node<>(key, value);
            newNode.next = buckets[index];
            buckets[index] = newNode;
        }

        // Get method: Retrieve value for a given key
        public V get(K key) {
            int index = getBucketIndex(key);  // Get the index for the key
            Node<K, V> head = buckets[index]; // Get the linked list at this index

            // Traverse the linked list to find the key
            while (head != null) {
                if (head.key.equals(key)) {
                    return head.value; // Return the value if key is found
                }
                head = head.next;
            }

            return null; // Return null if key is not found
        }

        // Remove method: Delete the key-value pair for a given key
        public void remove(K key) {
            int index = getBucketIndex(key);  // Get the index for the key
            Node<K, V> head = buckets[index]; // Get the linked list at this index
            Node<K, V> prev = null;

            // Traverse the linked list to find the key
            while (head != null) {
                if (head.key.equals(key)) {
                    if (prev == null) {
                        // If the node to remove is the head of the list
                        buckets[index] = head.next;
                    } else {
                        // If the node to remove is in the middle of the list
                        prev.next = head.next;
                    }
                    return;  // Key found and removed
                }
                prev = head;
                head = head.next;
            }
        }

        // Print the hash map (For debugging purposes)
        public void printMap() {
            for (int i = 0; i < SIZE; i++) {
                Node<K, V> head = buckets[i];
                System.out.print("Bucket " + i + ": ");
                while (head != null) {
                    System.out.print("[" + head.key + "=" + head.value + "] -> ");
                    head = head.next;
                }
                System.out.println("null");
            }
        }
}
