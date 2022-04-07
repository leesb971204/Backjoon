import java.util.*;
public class Main{
	static int n,m;
	static int[][] arr;
	static boolean[] visit;
	static int cnt = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i=0;i<m;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		dfs(1);
		System.out.println(cnt-1);
		
		
	}
	static void dfs(int start)
	{
		visit[start] = true;
		cnt++;
		
		for(int i=0;i<=n;i++)
		{
			if(arr[start][i] == 1 && !visit[i])
				dfs(i);
		}
	}
}