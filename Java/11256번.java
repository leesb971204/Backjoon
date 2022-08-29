import java.util.*;
public class Main {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=0;i<n;i++)
     {
    	 int candy = sc.nextInt();
    	 int box = sc.nextInt();
    	 int cnt = 0;
    	 Integer[] arr = new Integer[box];
    	 for(int j=0;j<arr.length;j++)
    	 {
    		 int x = sc.nextInt();
    		 int y = sc.nextInt();
    		 arr[j] = (x*y);
    	 }
    	 Arrays.sort(arr, Collections.reverseOrder());
    	 while(candy > 0) {
    		 candy -= arr[cnt];
    		 cnt++;
    	 }
    	 System.out.println(cnt);
     }
 }
}