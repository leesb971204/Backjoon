//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc= new Scanner(System.in);
  	int[] arr = {1,1,2,2,2,8};
  	int[] arr2 = new int[arr.length];
  	for(int i=0;i<arr2.length;i++)
  	{
  		arr2[i] = arr[i] - sc.nextInt();
  		if(i==arr2.length-1)
  			System.out.print(arr2[i]);
  		else
  			System.out.print(arr2[i]+" ");
  		
  	}
  }
}	
