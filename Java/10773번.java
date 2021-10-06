//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int sum = 0;
	  Stack<Integer> st = new Stack<>();
	  for(int i=0;i<num;i++)
	  {
		  int input = sc.nextInt();
		  if(input == 0)
			  st.pop();
		  else 
			  st.push(input);
	  }
	  for(int i : st)
	  {
		  sum += i;
	  }
	  System.out.println(sum);
  }
}