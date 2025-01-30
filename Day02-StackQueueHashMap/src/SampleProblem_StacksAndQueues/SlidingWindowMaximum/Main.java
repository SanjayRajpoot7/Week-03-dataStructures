package SampleProblem_StacksAndQueues.SlidingWindowMaximum;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SlidingWindow slidingWindow = new SlidingWindow();
            int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;

            int[] result = slidingWindow.maxSlidingWindow(nums, k);
            System.out.println(Arrays.toString(result));  // Output: [3, 3, 5, 5, 6, 7]
        }
    }

