import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt(), m = sc.nextInt();
		System.out.println(m-(k*n) >= 0 ? 0 : Math.abs(m-(k*n)));
	}
}
