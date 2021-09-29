//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int num = sc.nextInt();
    int result = 0;
  	for(int i=1;i<num;i++)
  	{
  	  	int tmp = i;
  	  	int sum = 0;
  	  	while(tmp != 0) {
  	  		sum += tmp % 10;
  	  		tmp /= 10;
  	  	}
  	  	if(sum + i == num) {
  	  		result = i;
  	  		break;
  	  	}
  	}
      System.out.println(result);
  }
}