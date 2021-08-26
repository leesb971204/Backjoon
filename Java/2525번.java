//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc= new Scanner(System.in);
  	int A = sc.nextInt();
  	int B = sc.nextInt();
  	int num = sc.nextInt();
  	System.out.println((A+(B+num)/60)%24+" "+(B+num)%60);
  }
}	
