//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int num = sc.nextInt();
  	int ball = 1;
  	for(int i=0;i<num;i++)
  	{
  		int a = sc.nextInt();
  		int b = sc.nextInt();
  		if(a != ball && b == ball)
  			ball = a;
  		else if(a== ball && b != ball)
  			ball = b;
  	}
  	System.out.println(ball);
  }
}