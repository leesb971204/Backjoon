//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int[] dp = new int[100001];
    	int input = sc.nextInt();
    	dp[1] = 1;dp[2] = 1;dp[3] = 2;dp[4] = 2;dp[5] = 1;dp[6] = 2;dp[7] = 1;
    	for(int i=8;i<=input;i++)
    	{
    		if(i%7 == 0)
    			dp[i] = i/7;
    		else {
    			int[] arr = {dp[i-7],dp[i-5],dp[i-2],dp[i-1]};
    			Arrays.sort(arr);
    			dp[i] = arr[0] + 1;
    		}
    	}
    	System.out.println(dp[input]);
    }
}
