import java.util.*;

class BookShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int w = scan.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; ++i) wt[i] = scan.nextInt();
        for (int i = 0; i < n; ++i) val[i] = scan.nextInt();
        System.out.println(solve(wt, val, n, w));
    }

    private static int solve(int[] wt, int[] val, int n, int w) {
//        int mod = 1000000007;
        int[][] dp = new int[n+1][w + 1];

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= w; ++j) {
                if (wt[i-1] <= j) dp[i][j] = Math.max(dp[i-1][j] , val[i-1]+dp[i-1][j-wt[i-1]]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][w];
    }
}