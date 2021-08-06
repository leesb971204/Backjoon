//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int start = sc.nextInt();
    	int end = sc.nextInt();
    	int sum = 0;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=start;i<=end;i++)
    	{
    		int cnt = 0;
    		for(int k=2;k<=Math.sqrt(i);k++)
    		{
    			if(i % k == 0) {
    				cnt++;
    			}
    		}
    		if(cnt == 0) {
    			if(i != 1) {
    				sum += i;
    				list.add(i);
    			}
    		}
    	}
    	System.out.println(sum > 0 ? sum+"\n"+list.get(0) : -1);
    }
}