//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int[] arr = new int[6];
  	int sum = 0;
  	for(int i=0;i<arr.length;i++)
  	{
  		arr[i] = sc.nextInt();
  		sum += arr[i] * 5;
  	}
  	System.out.println(sum);
  }
}