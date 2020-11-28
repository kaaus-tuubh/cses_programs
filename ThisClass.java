import java.util.*;

class ThisClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long ans = 1;
        while(n-- > 0) {
            ans = (long)((ans *2) % (1e9+7));
//            System.out.println(ans);
        }
         System.out.println(ans);
    }
}