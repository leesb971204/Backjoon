//https://velog.io/@cjhlsb
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			String input = sc.next();
			int cnt = 0;
			Stack<Character> st = new Stack<>();
			for (int j = 0; j < input.length(); j++) {
				st.push(input.charAt(j));
			}
			if (st.peek() == '(') {
				cnt = 1;
			} else {
				while (st.size() > 0) {
					if(cnt > 0)
						break;
					if(st.peek() == ')') {
						st.pop();
						cnt--;
					}
					else if(st.peek() == '(') {
						st.pop();
						cnt++;
					}
				}
			}
			System.out.println(cnt != 0 ? "NO" : "YES");
		}
		
	}
}