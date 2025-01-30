package SampleProblem_HashMapsAndHashFunctions.TwoSumProblem;

    import java.util.HashMap;

     class TwoSum {

        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>(); // To store number and its index

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i]; // Calculate the complement of the current number

                // Check if the complement is already in the map
                if (map.containsKey(complement)) {
                    // If found, return the pair of indices
                    return new int[] { map.get(complement), i };
                }

                // If not found, add the current number and its index to the map
                map.put(nums[i], i);
            }

            // Return an empty array if no solution exists
            return new int[] {};
        }


    }


