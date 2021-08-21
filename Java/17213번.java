//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int[][] dp = new int[n+1][m+1];
    	for(int i=1;i<=n;i++)
    	{
    		dp[i][i] = 1;
    	}
    	for(int i=1;i<=m;i++)
    	{
    		dp[1][i] = 1;
    	}
    	for(int i=2;i<=n;i++)
    	{
    		for(int j=i+1;j<=m;j++)
    		{
    			for(int k=1;k<j;k++)
    			{
    				dp[i][j] += dp[i-1][k];
    			}
    		}
    	}
    	System.out.println(dp[n][m]);
    }
}
