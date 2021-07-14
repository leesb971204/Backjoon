//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int sum = 0;
       int i = 0;
       while(true)
       {
    	   sum += ++i;
    	   if(sum >= num)
    		   break;
       }
       int tmp = num -(sum - i); //4
       if(i%2!=0)    
    	 System.out.println(i-tmp+1+"/"+tmp);
       
       else
    	 System.out.println(tmp+"/"+(i-tmp+1));  
    }
}