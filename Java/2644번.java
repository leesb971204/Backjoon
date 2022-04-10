import java.util.*;
public class Main{
	static int n,m;
	static int[][] arr;
	static boolean[] visit;
	static int chon1, chon2;
	static int cnt = 0;
	static int[] res;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		chon1 = sc.nextInt();
		chon2 = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
		res = new int[n+1];
		for(int i=0;i<m;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		dfs(chon1);
		System.out.println(res[chon2] == 0 ? -1 : res[chon2]);
	}
	static void dfs(int start)
	{
		visit[start] = true;
		if(start == chon2) {
			return;
		}
		
		for(int i=0;i<=n;i++)
		{
			if(arr[start][i] == 1 && !visit[i]) {
				res[i] = res[start]+1;
				dfs(i);
			}
		}
	}
}