//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	String input = sc.next();
  	String[] arr = input.split("-");
  	for(int i=0;i<arr.length;i++)
  	{
  		if(arr[i].contains("+")) {
  			String[] arr2 = arr[i].split("\\+");
  			int a = 0;
  			for(int j=0;j<arr2.length;j++)
  			{
  				a += (Integer.parseInt(arr2[j]));
  			}
  			arr[i] = Integer.toString(a);
  		}
  	}
  	int sum = Integer.parseInt(arr[0]);
  	for(int i = 1;i<arr.length;i++)
  	{
  		sum -= Integer.parseInt(arr[i]);
  	}
  	System.out.println(sum);
  }
}