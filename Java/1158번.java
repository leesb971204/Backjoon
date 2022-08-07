import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			que.add((i+1));
		}
		ArrayList<Integer> list = new ArrayList<>();
		while(!que.isEmpty()) {
				for(int i=0;i<k-1;i++)
				{
					que.add(que.poll());					
				}
				list.add(que.poll());
			
		}
		
		System.out.print("<");
		for(Integer i : list)
		{
			System.out.print(list.get(list.size()-1) == i ? i : i+", ");
		}
		System.out.print(">");
 }
}
