import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] arr = new long[(int) n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += Math.abs(arr[i] - (i+1));
		}
		System.out.println(sum);
		
		
	}
}
