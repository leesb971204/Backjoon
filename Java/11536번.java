import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		boolean inc = false;
		boolean dec = false;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.next();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i].compareTo(arr[i+1]) > 0)
				dec = true;
			else {
				dec = false;
				break;
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i].compareTo(arr[i+1]) < 0)
				inc = true;
			else {
				inc = false;
				break;
			}
		}
		
		if(dec)
			System.out.println("DECREASING");
		else if(inc)
			System.out.println("INCREASING");
		else
			System.out.println("NEITHER");
	}
}
