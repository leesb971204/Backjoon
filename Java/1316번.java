//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int cnt = num;
       for(int i=0;i<num;i++)
       {
    	   String input = sc.next();
    	   for(int j=1;j<input.length();j++)
    	   {
    		   if(input.indexOf(input.charAt(j-1)) > input.indexOf(input.charAt(j))) {
    			   cnt--;
    			   break;
    		   }
    	   }
       }
       System.out.println(cnt);
    }
}