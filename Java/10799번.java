//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	String input = sc.next();
  	int sum = 0;
  	Stack<Character> st = new Stack<>();
  	for(int i=0;i<input.length();i++)
  	{
  		if(input.charAt(i) == '(')
  			st.push(input.charAt(i));
  		else {
  			if(input.charAt(i-1) == ')') {
  				st.pop();
  				sum++;
  			}
  			else {
  				st.pop();
  				sum += st.size();
  			}
  		}
  	}
  	System.out.println(sum);
  }
}