#include<bits/stdc++.h>
using namespace std;

    int solve(int wt[], int val[], int n, int w) {
//        int mod = 1000000007;
		int dp[n+1][w+1];
		for(int i=0;i<=n;++i)
			for(int j=0;j<=w;++j)
				if(i==0 || j==0){
					dp[i][0] = 0;
					dp[0][j] = 0;
				} 
				
				
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= w; ++j) {
                if (wt[i-1] <= j) dp[i][j] = max(dp[i-1][j] , val[i-1]+dp[i-1][j-wt[i-1]]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][w];
    }
	
    int main() {
        int n; cin>>n;
        int w; cin>>w;
        int wt[n];
        int val[n];
        for (int i = 0; i < n; ++i) cin>>wt[i];
        for (int i = 0; i < n; ++i) cin>>val[i];
        cout<<(solve(wt, val, n, w));
    }