import java.util.*;
public class Main{
	static int n,m;
	static int[][] arr;
	static boolean[][] visit;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		visit = new boolean[n][m];
		for(int i=0;i<n;i++)
		{
			String input = sc.next();
			for(int j=0;j<m;j++)
			{
				arr[i][j] = Character.getNumericValue(input.charAt(j));
			}			
		}
		visit[0][0] = true;
		bfs(0,0);
		System.out.println(arr[n-1][m-1]);
	}
	static void bfs(int x, int y)
	{
		//시작 좌표 큐에 넣고 시작
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		
		while(!que.isEmpty())
		{
			int[] now = que.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0;i<4;i++)
			{
				//다음 방문할 x,y좌표
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				//다음 좌표가 범위를 벗어나면 건너뛰기
				if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
					continue;
				//방문했던 좌표이거나 이동할 수 없는 칸이면 건너뛰기
				if(visit[nextX][nextY] || arr[nextX][nextY] == 0)
					continue;
				
				//다음좌표 큐에 넣음
				que.add(new int[] {nextX,nextY});
				//방문처리
				visit[nextX][nextY] = true;
				//카운트 1씩 증가
				arr[nextX][nextY] = arr[nowX][nowY] + 1;
			}
		}
	}
}