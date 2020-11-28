import java.util.*;

class DiceCombination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(solve(n));
    }

    private static int solve(int sum) {
        int mod = 1000000007;
        int[]dp = new int[sum+1];
        dp[0] = 1;

        for(int i=1;i<=sum;++i) {
            for(int j=1;j<=6;++j) {
                if(j>i) break;
                dp[i] = (dp[i] + dp[i-j]) % mod;
            }
        }
        return dp[sum];
    }
}