import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int size = sc.nextInt();
			Deque<String> deq = new LinkedList<>();
			deq.add(sc.next());
			for(int j=0;j<size-1;j++)
			{
				String input = sc.next();
				if(deq.getFirst().compareTo(input) >= 0)
					deq.addFirst(input);
				else
					deq.addLast(input);
			}
			String output = deq.toString().replaceAll(",", "").replaceAll(" ", "");
			System.out.println(output.substring(1,output.length()-1));
			
		}
		
		
		
		
	}
}
