//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  int K = sc.nextInt();
	  Queue<Integer> que = new LinkedList<>();
	  ArrayList<Integer> list = new ArrayList<>();
	  for(int i=0;i<N;i++)
	  {
		  que.offer(i+1);
	  }
	  while(!que.isEmpty())
	  {
		  for(int i=0;i<K-1;i++)
		  {
			  int tmp = que.poll();
			  que.offer(tmp);
		  }
		  list.add(que.poll());
	  }
	  String i = list.toString();
	  i = i.substring(1, i.length()-1);
	  System.out.println("<"+i+">");
	  
  }
}