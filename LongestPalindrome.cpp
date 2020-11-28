#include<bits/stdc++.h>
using namespace std;
	
	int middleOut(string s, int right, int left) {
        while( right<s.length() && left>=0 && s[right] == s[left]) {
            right++;
            left--;
        }
        return right - left - 1;
    }
	
    string longestPalindrome(string s) {

        if(s.length()<1) return "";

        int len1 = 0, len2 = 0, maxlen = 0;
        int start = 0, end = 0;
        for(int i=0;i<s.length()-1;++i) {

            len1 = middleOut(s, i, i);
            len2 = middleOut(s, i, i+1);

            maxlen = max(len1, len2);
            if(maxlen > end - start) {
                start = i - (maxlen-1)/2;
                end = i + (maxlen)/2;
            }
        }

        return s.substr(start, end+1);

    }

    
	int main() {
        
        string s;cin>>s;
        cout<<(longestPalindrome(s));
    }
