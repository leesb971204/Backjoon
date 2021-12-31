import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int cnt = 0;
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int i = arr.length-1;
		while(i > 0) {
			if(arr[i-1] >= arr[i]) {
				arr[i-1]--;
				cnt++;
			}
			else
				i--;
		}
		System.out.println(cnt);
		
		
	}
}
