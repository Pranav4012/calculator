package pranav.examples.model;

class Solution {
    static int minJumps(int[] arr, int n) {
        // Base cases
        if (n <= 1) return 0;  // Already at the last index, no jumps needed
        if (arr[0] == 0) return -1;  // Can't move anywhere

        int maxReach = arr[0];  // The farthest index reachable
        int steps = arr[0];  // Steps left before next jump
        int jumps = 1;  // At least one jump needed

        // Start iterating through the array
        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps;  // Reached the last index

            // Update maxReach
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;  // Use one step to move forward

            // If steps become zero, we need to jump
            if (steps == 0) {
                jumps++;  // Increase the jump count

                // If we can't move further, return -1 (not possible to reach end)
                if (i >= maxReach) return -1;

                // Reset steps for the new jump
                steps = maxReach - i;
            }
        }
        return -1;  // If we never reach the end
    }

    public static void main(String[] args) {
        // Given array elements
        int[] arr = {1, 4, 3, 7, 1, 2, 6, 7, 6, 10};
        int n = arr.length;

        // Calling the function and printing result
        int result = minJumps(arr, n);
        System.out.println("Minimum jumps required: " + result);
    }
}

