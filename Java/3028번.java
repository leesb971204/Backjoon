import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String input = sc.next();
    	int ball = 1;
    	for(int i=0;i<input.length();i++)
    	{
    		char a = input.charAt(i);
    		if(a == 'A') {
    			if(ball == 1)
    				ball = 2;
    			else if(ball == 2)
    				ball = 1;
    		}
    		else if(a == 'B') {
    			if(ball == 2)
    				ball = 3;
    			else if(ball == 3)
    				ball = 2;
    		}
    		else {
    			if(ball == 3)
    				ball = 1;
    			else if(ball == 1)
    				ball = 3;
    		}
    	}
    	System.out.println(ball);
    }
}