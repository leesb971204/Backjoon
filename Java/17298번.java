//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[num];
		Stack<Integer> st = new Stack<>(); //정답 출력용 스택
		Stack<Integer> tmp = new Stack<>(); //인덱스 저장용 스택
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			while(!tmp.isEmpty() && arr[i] >= tmp.peek()) { //임시스택이 비어있거나 오큰수를 찾을때 까지
					tmp.pop();
				}
				if(tmp.isEmpty()) { //오큰수가 없으면
					st.push(-1);
					tmp.push(arr[i]);
				}
				else { //오큰수가 있으면
					st.push(tmp.peek());
					tmp.push(arr[i]);
				}
		}
		while(!st.isEmpty())
		{
			sb.append(st.pop()+" ");
		}
		System.out.print(sb);
	}
}