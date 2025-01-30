package SampleProblem_StacksAndQueues.SlidingWindowMaximum;

import java.util.Deque;
import java.util.ArrayDeque;


public class SlidingWindow {


        public static int[] maxSlidingWindow(int[] array, int k) {
            if (array == null || array.length == 0 || k == 0) {
                return new int[0];
            }

            int n = array.length;
            int[] result = new int[n - k + 1];  // To store the result
            Deque<Integer> deque = new ArrayDeque<>();  // Deque to store indices

            for (int i = 0; i < n; i++) {
                // Remove indices that are out of the window (i.e., less than i - k + 1)
                if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                    deque.pollFirst();
                }

                // Remove elements from the deque that are smaller than the current element
                // since they are not useful for future windows
                while (!deque.isEmpty() && array[deque.peekLast()] <= array[i]) {
                    deque.pollLast();
                }

                // Add the current element's index to the deque
                deque.offerLast(i);

                // Start recording the result after the first full window (i >= k - 1)
                if (i >= k - 1) {
                    result[i - k + 1] = array[deque.peekFirst()];
                }
            }

            return result;

    }
}
