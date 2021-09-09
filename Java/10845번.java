//https://velog.io/@cjhlsb
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
  public static void main(String[] args) throws IOException{
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	int num = Integer.parseInt(br.readLine());
  	int last = 0;
  	StringTokenizer st;
  	StringBuilder sb = new StringBuilder();
  	Queue<Integer> queue = new LinkedList<>();
  	for(int i=0;i<num;i++)
  	{
  		st = new StringTokenizer(br.readLine());
  		String input = st.nextToken();
  		
  		if(input.equals("pop")) {
  			sb.append(queue.peek()!=null?queue.peek():-1).append("\n");
  			queue.poll();
  		}
  		else if(input.equals("push")) {
			int a = Integer.parseInt(st.nextToken());
			queue.add(a);
			last = a;
  		}
  		else if(input.equals("front")) {
  			sb.append(queue.peek()!=null?queue.peek():-1).append("\n");
  		}
  		else if(input.equals("back")) {
  			sb.append(queue.contains(last)?last:-1).append("\n");
  		}
  		else if(input.equals("size")) {
  			sb.append(queue.size()).append("\n");
  		}
  		else if(input.equals("empty")) {
  			sb.append(queue.isEmpty()?1:0).append("\n");
  		}
  		
  	}
  	System.out.println(sb);
  	
  }
}