//https://velog.io/@cjhlsb
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++)
		{
			String func = bf.readLine();
			int cnt = Integer.parseInt(bf.readLine());
			String array = bf.readLine();
			String[] arr = array.substring(1, array.length()-1).split(",");
			Deque<Integer> dq = new LinkedList<>();
			
			for(int j=0;j<cnt;j++)
			{
				dq.add(Integer.parseInt(arr[j]));
			}
			
			Boolean rv = false;
			Boolean error = false;
			for(int j=0;j<func.length();j++)
			{
				if(func.charAt(j) == 'R')
					rv = !rv;
				else if(func.charAt(j) == 'D') {
					if(dq.isEmpty()) {
						error = !error;
						break;
					}
						
					if(rv)
						dq.pollLast();
					else
						dq.pollFirst();
				}
			}
			
			if(!error) {
			sb.append("[");
				if(rv)
				{
					if(!dq.isEmpty()) 
					{
					sb.append(dq.pollLast());
					while(!dq.isEmpty()) 
						{
						sb.append(",").append(dq.pollLast());
						}
					}
				}
				else if(!rv) {
					if(!dq.isEmpty()) {
					sb.append(dq.pollFirst());
					while(!dq.isEmpty()) {
						sb.append(",").append(dq.pollFirst());
					}
					}
					
				}
			sb.append("]\n");
			}
			else if(error)
				sb.append("error\n");
			
		}
		System.out.print(sb);
		
	}
}