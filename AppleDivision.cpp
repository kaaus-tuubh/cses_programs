#include<bits/stdc++.h>
using namespace std;
/*	
	bool solve(long long sum, long long a[], int n) {
		bool dp[n+1][sum+1];
		for(int i=0;i<=n;++i) {
			for(long long j=0;j<=sum;++j) {
				if(i==0) dp[i][j] = true;
				if(j==0) dp[i][j] = true;
				else dp[i][j] = false;
			}
		}
		
		for(int i=1;i<=n;++i) {
			for(long long j=0;j<sum;++j) {
				if(a[i-1]<=j) dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
				else dp[i][j] = dp[i-1][j];
			}
		}
		return dp[n][sum];
	}
	
	int main() 
	{
			int n;cin>>n;
			long long a[n];
			long long sum = 0;
			for(int i=0;i<n;++i) {
				cin>>a[i];
				sum+=a[i];
			}
			long long ans = 0;
			if(n==1) ans = sum;
			else {
				for(long long i=sum/2;i<=sum;++i) {
					cout<<"sum is "<<i<<"\n";
					if(solve(i,a, n)){
						ans = abs(sum - 2*i);
						cout<<ans<<"\n";
						break;
					}
				}
			}
			cout<<ans<<"\n";
			
		return 0;
	}

    */
	
	
	int main() 
	{
			int n;cin>>n;
			int a[n];
			int sum = 0;
			for(int i=0;i<n;++i) {
				cin>>a[i];
				sum+=a[i];
			}
			int ans = INT_MAX;
			for(int i=0;i< (1<<n) ;++i) {
				int c=0;
				for(int j=0;j<n;++j) {
					if(1<<j & i) c+=a[j];
				}
				ans = min(ans, abs(sum-c-c));
			}
		cout<<ans<<"\n";	
		return 0;
	}