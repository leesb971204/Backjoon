import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deq = new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			String input = br.readLine();
			if(input.contains("push_front"))
				deq.addFirst(Integer.parseInt(input.substring(input.indexOf(" ")+1,input.length())));
			else if(input.contains("push_back"))
				deq.addLast(Integer.parseInt(input.substring(input.indexOf(" ")+1,input.length())));
			else if(input.equals("pop_front")) {
				if(!deq.isEmpty())
					System.out.println((deq.removeFirst()));
				else
					System.out.println("-1");
			}
			else if(input.equals("pop_back")) {
				if(!deq.isEmpty())
					System.out.println(deq.removeLast());
				else
					System.out.println("-1");
			}
			else if(input.equals("size"))
				System.out.println(deq.size());
			else if(input.equals("empty"))
				System.out.println(deq.isEmpty()? "1" : "0");
			else if(input.equals("front")) {
				if(!deq.isEmpty())
					System.out.println(deq.getFirst());
				else
					System.out.println("-1");
			}
			else if(input.equals("back")) {
				if(!deq.isEmpty())
					System.out.println(deq.getLast());
				else
					System.out.println("-1");
			}
		}
		
		
		
	}
}