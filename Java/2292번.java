//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int cnt = 1;
       int min = 2;
       
       if(num == 1)
       {
    	   System.out.println(1);
       }
       else
       {
    	   while(min<=num) {
    	   min = min + cnt*6;
    	   cnt++;
    	   }
    	   System.out.println(cnt);
       }
    }
}