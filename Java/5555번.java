import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String find = sc.next();
		int n = sc.nextInt();
		int cnt = 0;
		String word;
		for(int i=0;i<n;i++)
		{
			word = sc.next();
			word += word;
			if(word.contains(find))
				cnt++;
		}
		
		
		System.out.println(cnt);
		
		
	}
}
