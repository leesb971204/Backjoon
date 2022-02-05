import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++)
		{
			if(i % 3 == 2)
				continue;
			else
				sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
}
