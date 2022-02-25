import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), m = sc.nextInt(), M = sc.nextInt(),
				T = sc.nextInt(), R = sc.nextInt(), tmp = m, cnt = 0, time = 0;
		
		if((m + T) > M) {
			time = -1;
		}
		else {
		while(cnt != N) {
			
				
			if((m + T) <= M) {
				m += T;
				cnt++;
				time++;
			}
			else {
				if((m - R) < tmp) {
					m = tmp;
					time++;
				}
				else {
					m -= R;
					time++;
				}
			}
		}
		}
		System.out.println(time);
		
		
		
		
		
	}
}
