#include<bits/stdc++.h>
using namespace std;

	void solve(int n, int coins[]);
	int main() {
        int n;cin>>n;
        int coins[n];
        for (int i = 0; i < n; ++i) cin>>coins[i];
        solve(n, coins);
    }

    void solve(int n, int coins[]) {
//        int mod = 1000000007;
        int sum = 0;
        for(int i=0;i<n;++i) sum+=coins[i];
        bool dp[n + 1][sum + 1];
        for(int i=0;i<=n;++i) dp[i][0] = true;
		
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= sum; ++j) {
                if (coins[i - 1] <= j) dp[i][j] = dp[i - 1][j - coins[i - 1]] || dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j];
            }
        }
        vector<int> res;
        for (int j = 1; j <= sum; ++j) {
               if(dp[n][j]) res.push_back(j);
        }
        cout<<(res.size())<<"\n";
        for (int aq : res)
            cout<<aq<<" ";
    }