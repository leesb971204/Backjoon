//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc= new Scanner(System.in);
  	int num = sc.nextInt();
  	Queue <Integer> list = new LinkedList<Integer>();
  	for(int i=1;i<=num;i++)
  	{
  		list.add(i);
  	}
  	while(list.size() != 1) {
  		list.remove();
  		list.add(list.remove());
  	}
  		
  	
  	System.out.println(list.poll());
  }
}	
