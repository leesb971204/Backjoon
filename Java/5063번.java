//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc= new Scanner(System.in);
  	int num = sc.nextInt();
  	for(int i=0;i<num;i++)
  	{
  		int r = sc.nextInt();
  		int e = sc.nextInt();
  		int c = sc.nextInt();
  		if((e-c) > r)
  			System.out.println("advertise");
  		else if((e-c) == r)
  			System.out.println("does not matter");
  		else
  			System.out.println("do not advertise");
  	}
  }
}	
