//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int cnt = 0;
			LinkedList<int[]> que = new LinkedList<>();
			for(int j=0;j<n;j++)
			{
				que.offer(new int[] {j,sc.nextInt()});
			}
			
			while(!que.isEmpty())
			{
				int[] arr = que.poll();
				boolean flag = true;
				for(int[] q : que)
				{
					if(q[1] > arr[1])
						flag = false;
				}
				if(flag) {
					cnt++;
					if(arr[0] == m)
						break;
					
				}
				else
					que.add(arr);
			}
			System.out.println(cnt);
		}
	}
}