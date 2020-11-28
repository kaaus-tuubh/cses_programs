#include<bits/stdc++.h>
using namespace std;
	
	int main() 
	{
        int ttt;cin>>ttt;
        while (ttt-- > 0) {
            int a;cin>>a;
            int b;cin>>b;
            if((max(a, b) <= 2* min(a, b) && (a+b)%3 == 0)) cout<<"YES\n";
			else cout<<"NO\n";
        }
		return 0;

    }

    