//https://velog.io/@cjhlsb
//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = "}]()[{";
		int cnt = 0;
		for(int i=0;i<s.length();i++)
		{
			String tmp = s.substring(s.length()-i,s.length())+s.subSequence(0, s.length()-i);
			Stack<Character> st = new Stack<>();
			for(int j=0;j<tmp.length();j++)
			{
				if(tmp.charAt(j) == '(' || tmp.charAt(j) == '{' || tmp.charAt(j) == '[')
					st.push(tmp.charAt(j));
				
				else {
					switch(tmp.charAt(j)) {
					case ')':
						if(!st.isEmpty() && st.peek()=='(')
							st.pop();
						else
							st.push(tmp.charAt(j));
						break;
					case ']':
						if(!st.isEmpty() && st.peek()=='[')
							st.pop();
						else
							st.push(tmp.charAt(j));
						break;
					case '}':
						if(!st.isEmpty() && st.peek()=='{')
							st.pop();
						else
							st.push(tmp.charAt(j));
						break;
					}
				}
			}
			if(st.isEmpty())
				cnt++;
			
		}
		System.out.println(cnt);
	}
} 