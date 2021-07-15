//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       while(true)
       {
    	   int num = sc.nextInt();
    	   if(num == 0)
    		   break;
    	  for(int i=1;i<=num;i++)
    	  {
    		  for(int j=0;j<i;j++)
    		  {
    			  System.out.print("*");
    		  }
    		  System.out.println();
    	  }
       }
    }
}