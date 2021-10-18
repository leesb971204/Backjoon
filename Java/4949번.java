//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String input = sc.nextLine();
			if(input.equals("."))
				break;
			Stack<Character> st = new Stack<>();
			
			for(int i=0;i<input.length();i++)
			{
				if(input.charAt(i) == '(' || input.charAt(i) == '[')
					st.push(input.charAt(i));
				
				else if(input.charAt(i) == ')') {
					if(!st.isEmpty() && st.peek() == '(')
						st.pop();
					else
						st.push(input.charAt(i));
				}
				
				else if(input.charAt(i) == ']') {
					if(!st.isEmpty() && st.peek() == '[')
						st.pop();
					else
						st.push(input.charAt(i));
				}
			}
			System.out.println(st.isEmpty()?"yes":"no");
			
			
		}
	}
}