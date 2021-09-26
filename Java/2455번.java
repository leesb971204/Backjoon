//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int sum = 0;
  	int max = 0;
  	for(int i=1;i<=8;i++)
  	{
  		int num = sc.nextInt();
  		if(i % 2 == 0)
  			sum += num;
  		else
  			sum -= num;
  		
  		if(max < sum)
  			max = sum;
  	}
  	System.out.println(max);
  }
}