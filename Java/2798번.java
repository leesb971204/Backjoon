//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int n = sc.nextInt();
  	int m = sc.nextInt();
  	int[] arr = new int[n];
  	int sum = 0;
  	for(int i=0;i<arr.length;i++)
  	{
  		arr[i] = sc.nextInt();
  	}
  	Arrays.sort(arr);
  	
  	for(int i=0;i<arr.length-2;i++)
  	{
  		for(int j=i+1;j<arr.length-1;j++)
  		{
  			for(int k=j+1;k<arr.length;k++)
  			{
  				int tmp = arr[i] + arr[j] + arr[k];
  				if(tmp <= m && tmp >= sum) {
  					sum = tmp;
  				}
  				else if(tmp > m)
  					break;
  					
  			}
  		}
  	}
  	System.out.println(sum);
  }
}