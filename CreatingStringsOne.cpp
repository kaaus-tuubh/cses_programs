#include<bits/stdc++.h>
using namespace std;
	
	int main() 
	{
		string s;
		cin>>s;
		sort(s.begin(), s.end());
		vector<string> v;
		v.push_back(s);
		string p = s;
		while(next_permutation(p.begin(), p.end())) {
			v.push_back(p);
		}
		cout<<v.size()<<"\n";
		for(string str: v) cout<<str<<"\n";
		return 0;
	}

    