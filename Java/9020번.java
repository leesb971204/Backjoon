//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int i=0;i<n;i++)
    	{
    		int input = sc.nextInt();
    		ArrayList<Integer> list = new ArrayList<>();
    		for(int j=1;j<input;j++)
    		{
    			boolean flag = true;
    			for(int k=2;k<=Math.sqrt(j);k++)
    			{
    				if(j % k == 0)
    				{
    					flag = false;
    					break;
    				}
    			}
    			if(flag && j != 1)
    				list.add(j);
    		}
    		int up = input / 2;
			int down = input / 2;
    		
    		while(true)
    		{
    			if(list.contains(up) && list.contains(down)) {
    				System.out.println(down+" "+up);
    				break;
    			}
    			else {
    				up++;
    				down--;
    		}
    	}
    }
}
}
