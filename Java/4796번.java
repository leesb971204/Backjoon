import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		while(true)
		{
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();
			if(l == 0 && p == 0 && v == 0)
				break;
			else{
				System.out.println("Case "+cnt+": "+((v/p)*l+Math.min(v%p, l)));
				cnt++;
			}
		}
	}
}
