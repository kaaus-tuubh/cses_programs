#include<bits/stdc++.h>
using namespace std;

	int main() 
	{
			int n;cin>>n;
			int a[n];
			for(int i=0;i<n;++i) {
				cin>>a[i];
			}
			long long max1 = a[0];
			long long max_till_i = a[0];
			for(int i=1;i<n;++i) {
				max_till_i = (a[i] > (max_till_i+a[i]))?a[i]:(max_till_i+a[i]);
				max1 = (max1 > max_till_i) ? max1:max_till_i;
			}
			cout<<max1<<"\n";	
			return 0;
	}