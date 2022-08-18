import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.next();
		}
		Arrays.sort(arr,new Comparator<>() {
			@Override
			public int compare(String o1, String o2)
			{
				int compareA = o1.length() - o2.length();
				int compareB = o2.length() - o1.length();
				if(compareA == compareB)
				{
					int sum1 = 0;
					int sum2 = 0;
					for(int i=0;i<o1.length();i++)
					{
						if(Character.isDigit(o1.charAt(i)))
							sum1 += Character.getNumericValue(o1.charAt(i));
					}
					for(int i=0;i<o2.length();i++)
					{
						if(Character.isDigit(o2.charAt(i)))
							sum2 += Character.getNumericValue(o2.charAt(i));
					}
					compareA = sum1;
					compareB = sum2;
				}
				if(compareA == compareB) {
					return o1.compareTo(o2);
				}
				return compareA - compareB;
			}
		});
		for(String i : arr)
		{
			System.out.println(i);
		}
 }
}
