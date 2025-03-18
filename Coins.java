package pranav.examples.model;


class Solution {
    public int minCoins(int coins[], int sum) {
        int count = 0;
        int i = coins.length - 1;

        while (sum > 0 && i >= 0) {
            if (coins[i] <= sum) {
                int numCoins = sum / coins[i]; // Maximum coins of this denomination
                sum -= numCoins * coins[i];   // Reduce sum
                count += numCoins;            // Add to count
            }
            i--;
        }

        return (sum == 0) ? count : -1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] coins = {1, 5, 10, 25};
        int sum = 37;

        int result = obj.minCoins(coins, sum);
        if (result != -1)
            System.out.println("Minimum coins required: " + result);
        else
            System.out.println("Cannot make exact amount with given coins.");
    }
}

