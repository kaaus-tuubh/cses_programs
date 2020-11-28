import java.util.*;

class DistinctNumbers {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashSet<Integer> set = new HashSet<>(n);
		int x = 0;
		for(int i=0;i<n;++i) {
			x = scan.nextInt();
			set.add(x);
		}
		System.out.println(set.size());
	}
}