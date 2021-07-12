//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       while(true)
       {
    	   String input = sc.nextLine();
    	   if(input.equals("#"))
    		   break;
    	   
    	   String[] arr = input.split(" ");
    	   for(int i=0;i<arr.length;i++)
    	   {
    		   StringBuilder sb = new StringBuilder(arr[i]);
    		   System.out.print(sb.reverse()+" ");
    	   }
    	   System.out.println();
       }
    }
}