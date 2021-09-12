//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int n = sc.nextInt();
  	int k = sc.nextInt();
  	int[] arr = new int[k];
  	int sum = 0;
  	for(int i=0;i<arr.length;i++)
  	{
  		arr[i] = sc.nextInt();
  		switch(arr[i])
  		{
  		case 3:
  		case 4:{
  			sum += 2;
  			break;
  		}
  		case 5:
  		case 6:{
  			sum += 3;
  			break;
  		}
  		case 7:
  		case 8:{
  			sum += 4;
  			break;
  		}
  		}
  	}
  	System.out.println(n <= sum ? "YES":"NO");
  }
}


