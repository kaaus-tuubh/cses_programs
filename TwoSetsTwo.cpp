#include<bits/stdc++.h>
using namespace std;


    long solve(int n) {
        int mod = 1000000007;
        int sum = n*(n+1)/2;
        if(sum%2!=0) return 0;
        sum = sum/2;
        long dp[n+1][sum+1];

        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= sum; ++j) {
                if(i==0) dp[i][j] = 0;
                if(j==0) dp[i][j] = 1;
            }
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= sum; ++j) {
                if(i<=j) dp[i][j] = (dp[i-1][j])%mod + (dp[i-1][j-i])%mod;
                else dp[i][j] = dp[i-1][j];
            }
        }
        return (dp[n][sum])/2;
    }
	
	
	int main() {
       
        int n;cin>>n;
        cout<<(solve(n));
    }