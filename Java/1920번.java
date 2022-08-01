import java.util.*;
public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int[] arr = new int[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i] = sc.nextInt();
	 }
	 Arrays.sort(arr);
	 int m = sc.nextInt();
	 int[] search = new int[m];
	 for(int i=0;i<m;i++)
	 {
		 search[i] = sc.nextInt();
	 }
	 
	 for(int i=0;i<search.length;i++)
	 {
		 int low = 0;
		 int high = arr.length-1;
		 int mid = 0;
		 boolean flag = false;
		 while(low <= high) {
			 mid = (low + high) / 2;
			 if(arr[mid] < search[i])
				 low = mid + 1;
			 else if(arr[mid] > search[i])
				 high = mid -1;
			 else {
				 System.out.println("1");
				 flag = true;
				 break;
			 }
		 }
		 
		 if(!flag)
			 System.out.println("0");
	 }
	 
 }
}
