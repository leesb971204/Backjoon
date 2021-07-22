//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int[][] arr = new int[15][15];
    	
    	for(int i=1;i<=14;i++)
    	{
    		arr[0][i] = i;
    	}
    	for(int i=0;i<=14;i++)
    	{
    		arr[i][1] = 1;
    		arr[i][2] = arr[i][1]+1+i;
    	}
    	for(int i=1;i<=14;i++)
    	{
    		for(int j=2;j<=14;j++)
    		{
    			arr[i][j] = arr[i-1][j] + arr[i][j-1];
    		}
    	}
    	
    	for(int i=0;i<num;i++)
    	{
    		int k = sc.nextInt();
    		int n = sc.nextInt();
        	System.out.println(arr[k][n]);
    	}
    }
}