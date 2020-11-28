#include<bits/stdc++.h>
using namespace std;
	int solve(int coins[], int sum, int n);
	int main() {

        int n; cin>>n;
        int sum;cin>>sum;
        int coins[n];
        for (int i = 0; i < n; ++i) cin>>coins[i];
        cout<<(solve(coins, sum, n));
    }

    int solve(int coins[], int sum, int n) {
        int mod = 1000000007;
        int dp[sum + 1];
        dp[0] = 1;
		for(int i=1;i<=sum;++i) dp[i] = 0;
        for (int i = 1; i <= sum; ++i) {
            for (int j = 0; j < n; ++j) {
                if (coins[j] <= i) dp[i] = (dp[i] + dp[i - coins[j]] ) % mod;
            }
        }
        return dp[sum];
    }
