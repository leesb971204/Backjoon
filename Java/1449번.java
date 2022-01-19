import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] arr = new int[n];
		int cnt = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] - min > l-1) {
				cnt++;
				min = arr[i];
			}
				
		}
		System.out.println(cnt+1);
	}
}
