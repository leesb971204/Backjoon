import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		long sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++)
		{
			int tip = arr[i]-((i+1)-1);
			if(tip > 0)
				sum += tip;
		}
		
		System.out.println(sum);
		
	}
}
