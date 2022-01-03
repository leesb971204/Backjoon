import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int num = sc.nextInt();
		int cnt = 0;
		int low = 0;
		int high = arr.length-1;
		while(true) {
			if(low == high || low > high)
				break;
			
			if(arr[low] + arr[high] == num) {
				cnt++;
				low++;
				high--;
			}
			else if(arr[low] + arr[high] < num)
				low++;
			else if(arr[low] + arr[high] > num)
				high--;
		}
		
		System.out.println(cnt);
			
	}
}
