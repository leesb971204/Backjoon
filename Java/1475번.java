import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int[] arr = new int[10];
		
		
		for(int i=0;i<n.length();i++)
		{
			arr[Character.getNumericValue(n.charAt(i))]++;
		}
		
		if(arr[6] > arr[9] || arr[6] < arr[9]) {
			int tmp = (arr[6] + arr[9]) / 2;
			if((arr[6] + arr[9]) % 2 == 1) {
				arr[6] = tmp + 1;
				arr[9] = tmp;
			}
			else {
				arr[6] = tmp;
				arr[9] = tmp;
			}
			
		}
		
		int max = -1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);
			
			
	}
}
