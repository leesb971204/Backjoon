//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc= new Scanner(System.in);
  	int e = sc.nextInt();
  	int f = sc.nextInt();
  	int c = sc.nextInt();
  	int sum = e+f;
  	int cnt = 0;
  	while(sum >= c)
  	{
  		cnt += sum/c;
  		sum = sum/c + sum%c;
  	}
  	System.out.println(cnt);
  		
  }
}	
