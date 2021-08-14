//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	while(true)
    	{
    		int input = sc.nextInt();
    		int cnt = 0;
    		if(input == 0)
    			break;
    		for(int i = input+1;i<=input*2;i++)
    		{
    			boolean flag = true;
    			for(int j = 2;j<=Math.sqrt(i);j++)
    			{
    				if(i % j == 0)
    				{
    					flag = false;
    					break;
    				}
    			}
    			if(flag)
    				cnt++;
    		}
    		System.out.println(cnt);
    	}
    }
}