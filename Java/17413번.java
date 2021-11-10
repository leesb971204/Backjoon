//https://velog.io/@cjhlsb
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String output = "";
		String tmp = "";
		StringBuilder sb = new StringBuilder();
		int a = -1;
		int b = -1;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == '<') { // '<'만나면 a에 인덱스 저장 
				a = i;
				if(tmp.length() > 0) { // 태그와 태그 사이의 단어 뒤집고 tmp 초기화
					sb = new StringBuilder(tmp);
					sb = sb.reverse();
					output += sb;
					tmp = "";
				}
			}
			else if(s.charAt(i) == '>') // '>'만나면 b에 인덱스 저장
				b = i;
			else if(s.charAt(i) == ' ' && (a == -1 && b == -1)) { // 태그와 태그 사이의 단어 중 공백을 만나는 순간 뒤집고 tmp 초기화
				sb = new StringBuilder(tmp);
				sb = sb.reverse();
				output += sb+" ";
				tmp = "";
			}
				
			else // 태그에 속하는 단어이든 아니든 tmp에 저장
				tmp += s.charAt(i);
			if(a != -1 && b != -1) { // 태그에 속하는 단어를 저장해둔 a,b 인덱스로 구해 뒤집지 않고 결과값에 저장
				output += s.substring(a, b+1);
				a = -1;
				b = -1;
				tmp = "";
			}
		}
		if(tmp.length() > 0) { // tmp에 남아있는 단어가 있는 경우
			sb = new StringBuilder(tmp);
			sb = sb.reverse();
			System.out.println(output+sb.toString());
		}
		else
			System.out.println(output);
	}
} 