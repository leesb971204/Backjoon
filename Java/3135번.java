import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Math.abs(sc.nextInt() - b);
		}
		Arrays.sort(arr);
		int min = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(Math.abs(a-b) > arr[i]) {
				min = arr[i]+1;		
				break;
			}
		}	
		System.out.println(min == 0 ? Math.abs(a-b) : min);
 }
}
