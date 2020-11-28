import java.util.*;

class TrailingZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(solve(n));
    }
    private static int solve(int n) {
        int count = 0;
        for(int i=5;n/i>=1;i*=5) {
            count+= n/i;
        }
        return count;
    }
}