import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(n == 1 ? arr[0]*arr[0] : arr[0]*arr[arr.length-1]);
		
	}
}
