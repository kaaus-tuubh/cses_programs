import java.util.*;

class MoneySums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; ++i) coins[i] = scan.nextInt();
        solve(n, coins);
    }

    private static void solve(int n, int[] coins) {
//        int mod = 1000000007;
        int sum = 0;
        for(int aq: coins) sum+=aq;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for(int i=0;i<=n;++i) dp[i][0] = true;

        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= sum; ++j) {
                if (coins[i - 1] <= j) dp[i][j] = dp[i - 1][j - coins[i - 1]] || dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j];
            }
        }
        List<Integer> res = new LinkedList<>();
        for (int j = 1; j <= sum; ++j) {
               if(dp[n][j]) res.add(j);
        }
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i)+" ");
        }
    }
}