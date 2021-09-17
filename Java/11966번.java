//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int num = sc.nextInt();
  	long[] arr = new long[31];
  	boolean flag = false;
  	for(int i=0;i<arr.length;i++)
  	{
  		arr[i] = (long) Math.pow(2, i);
  		if(num == arr[i])
  			flag = true;
  	}
  	System.out.println(flag?1:0);
  }
}