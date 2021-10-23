//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int N = 666;
		int a = 1; //앞자리
		while(a != num)
		{
			N++;
			if(Integer.toString(N).contains("666"))
				a++;
		}
		System.out.println(N);
	}
}