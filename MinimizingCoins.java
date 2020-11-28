import java.util.*;

class MinimizingCoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = scan.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; ++i) coins[i] = scan.nextInt();
        System.out.println(solve(coins, sum));
    }

    private static int solve(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, sum + 1);
        dp[0] = 0;

        for (int j = 0; j < coins.length; ++j) {
            for (int i = 1; i <= sum; ++i) {
                if (coins[j] <= i) dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        return dp[sum] == sum + 1 ? -1 : dp[sum];
    }
}