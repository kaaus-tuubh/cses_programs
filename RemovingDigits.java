/*
//GREEDY APPROACH 
// --------------
import java.util.*;

class RemovingDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
//        int[] coins = new int[n];
//        for (int i = 0; i < n; ++i) coins[i] = scan.nextInt();
        System.out.println(solve(n));
    }
    private static int large(int n) {
        int largest = 0;
        while (n > 0) {
            int r = n % 10;
            largest = Math.max(r, largest);
            n /= 10;
        }
        return largest;
    }
    private static int solve(int n) {
//        int mod = 1000000007;
        int sum = 0;
        int largest ;
        while(n!=0) {
            largest = large(n);
            n-=largest;
            sum++;
        }
        return sum;
    }
}*/

// DP APPROACH
// -----------

import java.util.*;

class RemovingDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
//        int[] coins = new int[n];
//        for (int i = 0; i < n; ++i) coins[i] = scan.nextInt();
        System.out.println(solve(n));
    }

    private static int solve(int n) {
//        int mod = 1000000007;
        int[] ar = new int[n+1];
        int temp=0, rem = 0;
        for(int i=1;i<=n;i++){
            ar[i]=i;
            temp=i;
            while(temp>0){
                rem=temp%10;
                temp/=10;
                if(ar[i-rem]+1<ar[i]) ar[i]=ar[i-rem]+1;
            }
        }
        return ar[n];
    }
}