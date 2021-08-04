//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int cnt = 0;
    	for(int i=0;i<num;i++)
    	{
    		int input = sc.nextInt();
    		int cnt1 = 0;
    		for(int k=2;k<=Math.sqrt(input);k++) // 2부터 input/2까지 나누어 떨어지는 수가 없으면 input은 소수
    		{
    			if(input % k == 0) {
    				cnt1++;
    				break;
    			}
    		}
    		if(cnt1 == 0) {
    			if(input != 1)
    			cnt++;
    		}
    	}
    	System.out.println(cnt);
    }
}