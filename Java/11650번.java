import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[][] arr = new Integer[n][2];
		for(int i=0;i<n;i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr,new Comparator<Integer[]>(){
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if(o1[0].equals(o2[0]))
					return o1[1]-o2[1];
				else
					return o1[0]-o2[0];
			}
		});
		for(Integer[] a : arr)
		{
			System.out.println(a[0] +" " +a[1]);
		}
		
	}
	
}
