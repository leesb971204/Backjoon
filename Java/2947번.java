import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		while(!flag)
		{
			int tmp = 0;
			if(arr[0] > arr[1]) {
				tmp = arr[0];
				arr[0] = arr[1];
				arr[1] = tmp;
				for(int i : arr) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			if(arr[1] > arr[2]) {
				tmp = arr[1];
				arr[1] = arr[2];
				arr[2] = tmp;
				for(int i : arr) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			if(arr[2] > arr[3]) {
				tmp = arr[2];
				arr[2] = arr[3];
				arr[3] = tmp;
				for(int i : arr) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			if(arr[3] > arr[4]) {
				tmp = arr[3];
				arr[3] = arr[4];
				arr[4] = tmp;
				for(int i : arr) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] == i+1) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
		}
	}
}
