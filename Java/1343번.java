import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next()+".";
		StringBuilder sb = new StringBuilder(str);
		int cnt = 0;
		boolean flag = false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != '.') {
				cnt++;
			}
			else {
				if(cnt % 4 == 2) {
					for(int j=i-cnt;j<i-2;j++) {
						sb.setCharAt(j, 'A');
					}
					sb.setCharAt(i-1, 'B');
					sb.setCharAt(i-2, 'B');
				}
				else if(cnt % 4 == 0) {
					for(int j=i-cnt;j<i;j++) {
						sb.setCharAt(j, 'A');
					}
				}
				else if(cnt % 2 == 0) {
					for(int j=i-cnt;j<i;j++)
					{
						sb.setCharAt(j, 'B');
					}
				}
				else {
					flag = true;
					break;
				}
				
				cnt = 0;
			}
		}
		System.out.println(flag?"-1":sb.deleteCharAt(sb.length()-1).toString());
		
			
	}
}
