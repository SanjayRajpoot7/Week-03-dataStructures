package SampleProblem_HashMapsAndHashFunctions.FindSubarraysWithZeroSum;

import java.util.Map;
import java.util.HashMap;

//import java.util.*;

public class ZeroSumSubArrays {

        public static void findZeroSumSubarrays(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i]; // Update cumulative sum

                // If sum is zero, subarray exists from index 0 to i
                if (sum == 0) {
                    System.out.println("Subarray found from index 0 to " + i);
                }

                // If sum is seen before, it means a zero-sum subarray exists
                if (map.containsKey(sum)) {
                    int startIdx = map.get(sum) + 1;
                    System.out.println("Subarray found from index " + startIdx + " to " + i);
                } else {
                    // Store the first occurrence of this sum
                    map.put(sum, i);
                }
            }
        }
    }

