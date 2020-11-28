import java.util.*;

class EditDistance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String p = scan.next();
        System.out.println(solve(s, p));
    }

    private static int solve(String s, String p) {
//        int mod = 1000000007;
        int m = s.length();
        int n = p.length();

        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i <= m; ++i) {
            for (int j = 0; j <= n; ++j) {
               if(i==0) dp[i][j] = j;
               if(j==0) dp[i][j] = i;
            }
        }

        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if(s.charAt(i-1)==p.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] =  1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
            }
        }

        return dp[m][n];
    }
}