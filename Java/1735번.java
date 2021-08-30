//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc= new Scanner(System.in);
  	int A1 = sc.nextInt();
  	int B1 = sc.nextInt();
  	int A2 = sc.nextInt();
  	int B2 = sc.nextInt();
  	A1 *= B2;
  	A2 *= B1;
  	int ch = A1+A2;
  	int mo = B1*B2;
  	for(int i=2;i<=mo;i++)
  	{
  		if(ch%i == 0 && mo%i == 0) {
  			ch /= i;
  			mo /= i;
  			i--;
  		}
  	}
  	System.out.println(ch+" "+mo);
  }
}	
