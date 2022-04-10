import java.util.*;
public class Main{
	static int n,m;
	static int[][] arr;
	static boolean[] visit;
	static int cnt = 0;
	static Queue<Integer> que = new LinkedList<>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
		int v = sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		dfs(v);
		visit = new boolean[n+1];
		System.out.println();
		bfs(v);
		
	}
	static void dfs(int start)
	{
		visit[start] = true;
		System.out.print(start+" ");
		for(int i=0;i<=n;i++)
		{
			if(arr[start][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
	}
	static void bfs(int start)
	{
		que.add(start);
		visit[start] = true;
		while(!que.isEmpty())
		{
			start = que.poll();
			System.out.print(start+" ");
			for(int i=1;i<=n;i++)
			{
				if(arr[start][i] == 1 && !visit[i]) {
					que.add(i);
					visit[i] = true;
				}
			}
		}
	}
}