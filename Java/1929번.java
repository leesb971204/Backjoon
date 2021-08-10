//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int start = sc.nextInt();
    	int end = sc.nextInt();
    	
    	for(int i=start;i<=end;i++)
    	{
    		int cnt = 0;
    		boolean flag = true;
    		for(int k=2;k<=Math.sqrt(i);k++)
    		{
    			if(i % k == 0) 
    			{
    				flag = false;
    				break;
    			}
    		}
    		if(flag && i != 1) {
				System.out.println(i);
			}
    	}
    }
}