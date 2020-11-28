import java.util.*;

class CoinPiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ttt = scan.nextInt();
        while (ttt-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            a = Math.max(a, b);
            b = Math.min(a, b);
            if (2 * a > b) System.out.println("NO");
            else System.out.println(solve(a, b));
        }

    }

    private static String solve(int a, int b) {
        a %= 3;
        b %= 3;
        a = Math.max(a, b);
        b = Math.min(a, b);
        if((a==0 && b==0) || (a==2 && b==1)) return new String("YES");
        return new String("NO");
    }
}