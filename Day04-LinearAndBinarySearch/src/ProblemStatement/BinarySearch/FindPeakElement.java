package ProblemStatement.BinarySearch;

public class FindPeakElement {
        public static int findPeakElement(int[] nums) {
            int left = 0, right = nums.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                } else { // If mid is greater than next, move left
                    right = mid;
                }
            }

            // Left and right will converge at a peak element
            return left;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 1};  // Example input
            int peakIndex = findPeakElement(nums);
            System.out.println("Peak element is at index: " + peakIndex);
            System.out.println("Peak element value: " + nums[peakIndex]);
        }
    }


