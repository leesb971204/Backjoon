//https://velog.io/@cjhlsb
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bf.readLine());
		Queue<Integer> que = new LinkedList<>();
		int end = 0;
		for(int i=0;i<num;i++)
		{
			String input = bf.readLine();
			if(input.equals("pop")) {
				bw.write(que.isEmpty()?-1+"\n":que.poll()+"\n");
			}
			else if(input.equals("size")) {
				bw.write(que.size()+"\n");
			}
			else if(input.equals("empty")) {
				bw.write(que.isEmpty()?1+"\n":0+"\n");
			}
			else if(input.equals("front")) {
				bw.write(!que.isEmpty()?que.peek()+"\n":-1+"\n"); //Deque로 선언 시 .getFirst() 메소드 사용 가능
			}
			else if(input.equals("back")) {
				bw.write(!que.isEmpty()?end+"\n":-1+"\n"); //Deque로 선언 시 .getLast() 메소드 사용 가능
			}
			else if(input.contains("push")) {
				int a = Integer.parseInt(input.substring(5,input.length()));
				que.offer(a);
				end = a;
			}
		}
		bf.close();
		bw.flush();
		bw.close();
	}
}