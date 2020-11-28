import java.util.*;

class PalindromeReorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        solve(s);
    }

    private static void solve(String s) {
        int [] char_counts = new int[256];
       for(char ch : s.toCharArray()) {
           char_counts[ch]++;
       }
       StringBuilder sb = new StringBuilder(s);
       int i=0, j = s.length()-1;
       int count = 0;
        for (int k = 0; k < 256; k++) {
            while(char_counts[k] > 0) {
                if(char_counts[k] == 1) {
                    sb.setCharAt((s.length())/2, (char)k);
                    char_counts[k]--;
                    count++;
                }
                else{
                    sb.setCharAt(i++, (char)k);
                    sb.setCharAt(j--, (char)k);
                    char_counts[k]-=2;
                }
            }
        }
        if(count<=1) System.out.println(sb.toString());
        else System.out.println("NO SOLUTION");
    }
}