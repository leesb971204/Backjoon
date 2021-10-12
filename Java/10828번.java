//https://velog.io/@cjhlsb
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		Stack<Integer> st = new Stack<>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bf.readLine());
		for(int i=0;i<num;i++)
		{
			String input = bf.readLine();
			
			
			if(input.contains("push")) {
				String[] arr = input.split(" ");
				st.push(Integer.parseInt(arr[1]));
			}
			else if(input.equals("top"))
				bw.write(String.valueOf(!st.isEmpty()?st.peek() :-1)+"\n");
			else if(input.equals("size"))
				bw.write(String.valueOf(st.size())+"\n");
			else if(input.equals("empty"))
				bw.write(String.valueOf(st.isEmpty()?1:0)+"\n");
			else if(input.equals("pop"))
				bw.write(String.valueOf(!st.isEmpty()?st.pop() : -1)+"\n");
		}
		bw.flush();
		bw.close();		
		bf.close();
	}
}
