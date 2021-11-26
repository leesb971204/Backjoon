//https://velog.io/@cjhlsb
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String[] arr1 = new String[num1];
		String[] arr2 = new String[num2];
		int cnt = 0;
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.next();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.next();
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j].equals(arr1[i]))
					cnt++;
			}
		}
		System.out.println(cnt);
	}
} 

