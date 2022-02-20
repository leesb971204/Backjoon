import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<input.length();i++)
		{
			stack.add(input.charAt(i));
		}
		int n = Integer.parseInt(br.readLine());
		Stack<Character> tmp = new Stack<>();
		for(int i=0;i<n;i++)
		{
			String cmd = br.readLine();
			if(cmd.contains("P")) {
				stack.push(cmd.charAt(2));
			}
			else if(!stack.isEmpty() && cmd.contains("L")) {
				tmp.push(stack.pop());
			}
			else if(!tmp.isEmpty() && cmd.contains("D")) {
				stack.push(tmp.pop());
			}
			else if(!stack.isEmpty() && cmd.contains("B")) {
				stack.pop();
			}
		}
		while(!stack.isEmpty()) {
			tmp.push(stack.pop());
		}
		while(!tmp.isEmpty()) {
			bw.write(tmp.pop());
		}
		bw.flush();
		bw.close();
		
	}
}
