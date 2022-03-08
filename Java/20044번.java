import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n*2];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int[] score = new int[n];
		int low = 0, high = arr.length-1, mid = 0;
		while(mid != arr.length/2) {
			score[mid] = arr[low] + arr[high];
			low++;
			high--;
			mid++;
		}
		Arrays.sort(score);
		System.out.println(score[0]);
		
		
	}
}
