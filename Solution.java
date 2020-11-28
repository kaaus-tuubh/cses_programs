import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        if(n==1) System.out.println(1);
        else if(n<4) System.out.println("NO SOLUTION");
        else {
            for(int i=2;i<=n;i+=2) {
                System.out.print(i+" ");
            }
            for(int i=1;i<=n;i+=2) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}