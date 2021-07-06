//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int score_a = 100, score_b = 100;
       for(int i=0;i<num;i++)
       {
    	   int num_a = sc.nextInt();
    	   int num_b = sc.nextInt();
    	   if(num_a > num_b)
    		   score_b -= num_a;
    	   else if(num_a < num_b)
    		   score_a -= num_b;
       }
       System.out.print(score_a+"\n"+score_b);
    }
}