//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int num = sc.nextInt();
  	int[][] arr = new int[num][2];
  	int sum = 0;
  	for(int i=0;i<num;i++)
  	{
  		arr[i][0] = sc.nextInt();
  		arr[i][1] = sc.nextInt();
  	}
  	Arrays.sort(arr, new Comparator<int[]>() {
  		public int compare(int[] t1, int[] t2) {
  			return t1[0] - t2[0];
  		}
  	});
  	for(int i=0;i<arr.length;i++)
  	{
  		if(arr[i][0] > sum)
  			sum = arr[i][0] + arr[i][1];
  		else
  			sum += arr[i][1];
  	}
  	System.out.println(sum);
  }
}