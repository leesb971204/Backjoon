import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		int[] alp = new int[26];
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.next();
		}
		
		for(int i=0;i<num;i++)
		{
			int tmp = (int)Math.pow(10, arr[i].length()-1);
			for(int j=0;j<arr[i].length();j++)
			{
				alp[(int)arr[i].charAt(j)-65] += tmp;
				tmp /= 10;
			}
		}
		
		Arrays.sort(alp);
		int idx = 9;
		int sum = 0;
		for(int i=alp.length-1;i>=0;i--)
		{
			if(alp[i] == 0)
				break;
			
			sum += alp[i] * idx;
			idx--;
		}
		System.out.println(sum);
		
	}
}
