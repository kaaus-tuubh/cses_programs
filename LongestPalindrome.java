import java.util.*;

class LongestPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        StringBuilder b = new StringBuilder(s);
        b.reverse();
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {

        if(s == null || s.length()<1) return "";

        int len1 = 0, len2 = 0, maxlen = 0;
        int start = 0, end = 0;
        for(int i=0;i<s.length()-1;++i) {

            len1 = middleOut(s, i, i);
            len2 = middleOut(s, i, i+1);

            maxlen = Math.max(len1, len2);
            if(maxlen > end - start) {
                start = i - (maxlen-1)/2;
                end = i + (maxlen)/2;
            }
        }

        return s.substring(start, end+1);

    }

    private static int middleOut(String s, int right, int left) {
        while(right<s.length() && left>=0 && s.charAt(right) == s.charAt(left)) {
            right++;
            left--;
        }
        return right - left - 1;
    }
}