import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		long sum = 0;
		for(int i=0;i<cnt;i++) {
			Arrays.sort(arr);
			long tmp = 0;
			tmp = arr[0] + arr[1];
			arr[0] = tmp;
			arr[1] = tmp;
		}
		
		for(long i : arr) {
			sum += i;
		}
		
		System.out.println(sum);
			
	}
}
